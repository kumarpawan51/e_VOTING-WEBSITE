/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yash cmuter
 */
public class DBConnection {
       
 private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-AJIV93G:1521/Xe","e_voating_db","evoating");
            System.out.println("Connection opened!");
        }
        catch(Exception e)
        {
           System.out.println("DB Error in opening connection in DBconnection");
           e.printStackTrace();
        }  
    }
    
    public static Connection getConnection()
    {
        return conn;
        
    }

 
    public static void  closeConnection()throws SQLException
    {
        if(conn!=null)
        {
            conn.close();
        }
    }   
    
}
