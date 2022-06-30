package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.DAO.FabricaConexao;
import pacote.dominio.Cacamba;


/**
 *
 * @author Gustavo Almeida
 */
public class DAOCacamba {
    
   private Connection con;
    //Pre-compila a query para o banco de dados
    private PreparedStatement comando;
    
    // Classe acessada internamente para conectar com o banco
    private void conectar(){
        con = FabricaConexao.conexao();
    }
    
    //Classe que fecha a conexão com o banco
    private void fechar(){
        try{
            comando.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão"+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public boolean insereCacamba(Cacamba c1){
        
        conectar();
        String sql = "INSERT INTO cacamba(tamanho, nserie, "
                + "valor, locada) VALUES(?,?,?,?)";
          
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, c1.getTamanho());
            comando.setString(2, c1.getNserie());
            comando.setFloat(3, c1.getValor());
            comando.setBoolean(4, c1.isLocada());
            comando.execute();
            return true;
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao inserir registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        return false;
    }
    public  ArrayList<Cacamba> selecionarTodosRegistros()
    {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM CACAMBA";

        ArrayList<Cacamba> listaCacamba = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Cacamba cacamba = new Cacamba();
                cacamba.setTamanho(rs.getString("TAMANHO"));
                cacamba.setNserie(rs.getString("NSERIE"));
                cacamba.setLocada(rs.getBoolean("LOCADA"));
                cacamba.setValor(rs.getFloat("VALOR"));
                cacamba.setId(rs.getInt("ID"));
                listaCacamba.add(cacamba);
            }
            fechar();
            return listaCacamba;
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
}