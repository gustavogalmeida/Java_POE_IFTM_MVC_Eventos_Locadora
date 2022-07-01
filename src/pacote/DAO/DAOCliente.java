package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.DAO.FabricaConexao;
import pacote.dominio.Cliente;

/**
 *
 * @author Gustavo Almeida
 */
public class DAOCliente {
    
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
    
    public boolean insereCliente(Cliente cliente){
        
        conectar();
        String sql = "INSERT INTO CLIENTE(nome, endereco, "
                + "sexo, obs) VALUES(?,?,?,?)";
          
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEndereco());
            comando.setString(3, cliente.getSexo());
            comando.setString(4, cliente.getObs());
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
    public  ArrayList<Cliente> selecionarTodosRegistros()
    {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Cliente> listaCliente = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("NOME"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setSexo(rs.getString("SEXO"));
                cliente.setObs(rs.getString("OBS"));
                cliente.setId(rs.getInt("ID"));
                listaCliente.add(cliente);
            }
            fechar();
            return listaCliente;
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
    public boolean removeCliente (Integer id){
        conectar();
        String sql = "DELETE FROM CLIENTE WHERE ID=?";
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
    public boolean alteraCliente(Cliente cliente){
         conectar();
         String sql = "UPDATE CLIENTE SET NOME = ?, ENDERECO = ?, SEXO = ?, OBS = ? "
                 + "WHERE ID=?";
         try{
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEndereco());
            comando.setString(3, cliente.getSexo());
            comando.setString(4, cliente.getObs());
            comando.setInt(5, cliente.getId());
            comando.executeUpdate();
            return true;
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao atualizar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
         return false;
    }
}
