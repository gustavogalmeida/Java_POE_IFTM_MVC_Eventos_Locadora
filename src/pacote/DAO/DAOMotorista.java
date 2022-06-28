package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
}
