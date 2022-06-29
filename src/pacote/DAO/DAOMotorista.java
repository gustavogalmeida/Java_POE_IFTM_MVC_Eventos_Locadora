package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}