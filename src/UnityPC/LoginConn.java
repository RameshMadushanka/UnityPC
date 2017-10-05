package UnityPC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Derushan
 */
public class LoginConn {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN="jdbc:mysql://localhost:3306/unitypc";

public static void main(String args[])
{
            Connection conn =null;
            
            try{
                conn= DriverManager.getConnection(CONN,USERNAME,PASSWORD);
                System.out.println("Connected");  
                Statement  stmt =(Statement) conn.createStatement();
                //stmt.executeUpdate(insert); 
            } catch(SQLException e){
                 System.err.println(e);
            }
}
    
}
