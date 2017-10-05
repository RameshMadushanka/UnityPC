/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnityPC;

/**
 *
 * @author Derushan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class DummyData {
  String query=null;
 Statement st=null;
 
 public DummyData(String qry) {
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
custVet.add(""+rs.getInt(2));
custVet.add(rs.getString(3)); 
custVet.add(rs.getString(4)); 
custVet.add(""+rs.getInt(5));
custVet.add(""+rs.getInt(6));
custVet.add(""+rs.getInt(7));

cVector.add(custVet);
}
if(conn!=null)
conn.close();

return cVector;
}
}

