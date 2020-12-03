/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SqlConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Nelsinho
 */
public class Main {
    public static void main(String[] args)  {
        
        Connection con = ConnectionFactory.conector();
        PreparedStatement stmt = null;
        String sql = "inset into usuario(user, pass) value ('Nelson', '123')";
        
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println("Erro" + ex.toString());
        }
    }
}