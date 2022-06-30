package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.DAO.FabricaConexao;
import pacote.dominio.Motorista;
import pacote.DAO.DAOMotorista;


/**
 *
 * @author Gustavo Almeida
 */
public class DAOMotorista {
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
    
    public boolean insereMotorista(Motorista motorista){
        
        conectar();
        String sql = "INSERT INTO motorista(nome, cnh, "
                + "placa, sexo) VALUES(?,?,?,?)";
          
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, motorista.getNome());
            comando.setString(2, motorista.getCnh());
            comando.setString(3, motorista.getPlaca());
            comando.setString(4, motorista.getSexo());
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
    
    public  ArrayList<Motorista> selecionarTodosRegistros()
    {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM MOTORISTA";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Motorista> listaMotorista = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Motorista motorista = new Motorista();
                motorista.setNome(rs.getString("NOME"));
                motorista.setCnh(rs.getString("CNH"));
                motorista.setPlaca(rs.getString("PLACA"));
                motorista.setSexo(rs.getString("SEXO"));
                motorista.setId(rs.getInt("ID"));
                listaMotorista.add(motorista);
            }
            fechar();
            return listaMotorista;
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
    public boolean removeMotorista (Integer id){
        conectar();
        String sql = "DELETE FROM MOTORISTA WHERE ID=?";
        try{
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            return true;
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao excluir registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        return false;
    }
}