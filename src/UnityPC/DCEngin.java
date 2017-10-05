/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnityPC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Derushan
 */
public class DCEngin {
     String query=null;
 Statement st=null;
 
 public DCEngin(String qry) {
       query=qry;
    }

 public Vector getData()throws Exception
{  
    Vector<Vector<String>> cVector = new Vector<Vector<String>>();

Connection conn = DBconn.getConn();
st=conn.createStatement();

ResultSet rs = st.executeQuery(query);

while(rs.next())
{
    Vector<String> custVet = new Vector<String>();
    custVet.add(rs.getString(1)); 
    custVet.add(rs.getString(2)); 
    custVet.add(rs.getString(3)); 
    custVet.add(rs.getString(10)); 
    custVet.add(rs.getString(11));
    custVet.add(rs.getString(9)); 
    custVet.add(rs.getString(4)); 
    custVet.add(rs.getString(5));
    custVet.add(rs.getString(6));
    custVet.add(rs.getString(7));
    custVet.add(rs.getString(8));


cVector.add(custVet);
}
if(conn!=null)
conn.close();

return cVector;
}
    
}
