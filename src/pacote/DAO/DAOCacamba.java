package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public boolean insereCacamba(Cacamba cacamba){
        
        conectar();
        String sql = "INSERT INTO cacamba(tamanho, nserie, "
                + "valor, locada) VALUES(?,?,?,?)";
          
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, cacamba.getTamanho());
            comando.setString(2, cacamba.getNserie());
            comando.setFloat(3, cacamba.getValor());
            comando.setBoolean(4, cacamba.isLocada());
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
}