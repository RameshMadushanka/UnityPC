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
public class DCEngin3 {
    String query=null;
 Statement st=null;
 
 public DCEngin3(String qry) {
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
    custVet.add(""+rs.getInt(1));
    custVet.add(""+rs.getInt(2));
    custVet.add(rs.getString(3)); 
    custVet.add(rs.getString(4));
    custVet.add(""+rs.getDouble(5));
    custVet.add(""+rs.getInt(6));
    custVet.add(rs.getString(7));
    custVet.add(""+rs.getDate(8));
    custVet.add(""+rs.getInt(9));
    


cVector.add(custVet);
}
if(conn!=null)
conn.close();

return cVector;
}
}
