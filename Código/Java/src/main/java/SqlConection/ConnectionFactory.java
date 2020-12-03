package SqlConection;

import java.sql.*;

public class ConnectionFactory {
    
    public static Connection conector(){
    java.sql.Connection conexao = null;
     String url = "jdbc:mysql://localhost:3306/mktgames";
     String user = "root";
     String password = "L33Tsupa";
     String driver = "com.mysql.jdbc.Driver";

    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }catch (Exception e) {
        System.out.println(e);
        return null;
    }
    }
}