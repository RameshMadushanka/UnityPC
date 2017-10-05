package UnityPC;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Derushan
 */
public class DBconn {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN="jdbc:mysql://localhost:3306/unitypc"; 
    
    public static Connection getConn()
    {
        Connection conn=null;
       
        try
         {
          conn=DriverManager.getConnection(CONN,USERNAME,PASSWORD);

        }
        catch(Exception ex)
        {

        }
        return conn;
    } 
}
