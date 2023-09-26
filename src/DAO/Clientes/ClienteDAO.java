package DAO.Clientes;

import DAO.ConexaoDAO;
import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO objclientedto) {

        String sql = "INSERT INTO clientes (nome_cliente, telefone_cliente) VALUES ( ?, ? )";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getTelefone_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + e.getMessage());
        }

    }

    ;
    
    public ArrayList<ClienteDTO> ListarCliente() {

        String sql = "SELECT * FROM clientes ";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                ClienteDTO objclientedto = new ClienteDTO();
                objclientedto.setId_cliente(rs.getInt("id_cliente"));
                objclientedto.setNome_cliente(rs.getString("nome_cliente"));
                objclientedto.setTelefone_cliente(rs.getString("telefone_cliente"));

                lista.add(objclientedto);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Listar" + e.getMessage());
        }
        return lista;
    }

    ;

    
    public void editarCliente(ClienteDTO objclientedto) {

        String sql = "UPDATE clientes SET nome_cliente = ?, telefone_cliente = ? WHERE id_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getTelefone_cliente());
            pstm.setInt(3, objclientedto.getId_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Editar" + e.getMessage());
        }

    }
    
    public void excluirCliente(ClienteDTO objclientedto){
        String sql = "DELETE FROM clientes WHERE id_cliente = ?";
        
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objclientedto.getId_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + e.getMessage());
        }
                
    };

}
