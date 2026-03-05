package jdbc;

import java.sql.*;
 
public class JDBC_Example {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
	   
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "J@mmy2810");
 
Statement stmt=con.createStatement();
 
ResultSet rs=stmt.executeQuery(" select * from Employee");
 
while (rs.next())
{
	System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name")+ " "+ rs.getString("Last_Name") +" "+ rs.getString("Gender") +" "+rs.getInt("Age") +" "+ rs.getString("Address")+" "+ rs.getString("Mobile_Number") +" "+rs.getString("Dept")+" "+rs.getInt("Salary"));
}


String sql = "create table emp("
		+ "id int primary key,"
		+ "name varchar(50)";

stmt.executeUpdate(sql);


con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }
}
 
}
 


