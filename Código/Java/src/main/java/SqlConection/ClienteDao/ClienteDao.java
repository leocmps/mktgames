
package SqlConection.ClienteDao;

import SqlConection.ConnectionFactory;
import Conection.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDao {
    
    public void criaregistrobanco(Cliente c) {
        Connection con = ConnectionFactory.conector();
        PreparedStatement stmt = null;
        String sql = "insert into cliente (nome, cpf, senha1, senha2) values (?, ?, ?, ?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getSenha1());
            stmt.setString(4, c.getSenha2());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getEmail());
            stmt.setString(7, c.getCidade());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso");
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro ao salvar os dados" + e.toString());
        }
    }
}