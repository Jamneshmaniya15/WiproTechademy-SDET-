package jdbc;

import java.sql.*;
 
public class jdbcEx3 {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
	   
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb", "root", "J@mmy2810");
 
//Statement stmt=con.createStatement();

CallableStatement cs = con.prepareCall("{CALL getAllEmployees()}");
 
ResultSet rs=cs.executeQuery();
 
while (rs.next())
{
	System.out.println(rs.getInt("id") + " " + rs.getString("name")+ " "+rs.getInt("salary"));
}

con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }
}
 
}
 


