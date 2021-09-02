/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection_pkg;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author karen
 */
public class Connection_principal {
    protected Connection connection;
    
     public Connection_principal(Connection connection) {
        this.connection = connection;
    }
            
     public static Connection iniciar(){
        
        Connection connection = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        }
        catch(ClassNotFoundException | InstantiationException |
              IllegalAccessException | IllegalArgumentException |
              InvocationTargetException | NoSuchMethodException ex)
        {
            System.err.println("ERROR! no fue posible cargar el driver JDBC: "+ex.getLocalizedMessage());
            System.exit(1);
        }
        System.out.println("Conectado");
       
        String url = "jdbc:mysql://localhost/ciclismo_uam_db?serverTimezone=UTC";
        String username = "root";
        String password = "12345";
        
        try
        {
            connection = DriverManager.getConnection(url, username, password);            
        }
        catch(SQLException e)
        {
            System.err.println("Error ejecutando las consultas SQL: "+e.getMessage());
        }
        return connection;
    }
}
