/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author vishn
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
             Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","parifeb22");
             return (Connection) con;
        }
         catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}
