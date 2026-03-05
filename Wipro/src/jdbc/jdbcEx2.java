package jdbc;

import java.sql.*;

public class jdbcEx2 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee_db",
                "root",
                "J@mmy2810"
            );

            Statement stmt = con.createStatement();

            // 1️ Create table
            String createTable =
                "CREATE TABLE IF NOT EXISTS Employee_JDBC (" +
                "Emp_ID INT PRIMARY KEY," +
                "Name VARCHAR(50)," +
                "Dept VARCHAR(50)," +
                "Salary INT)";

            stmt.executeUpdate(createTable);
            System.out.println("Table created");

            // 2️ Insert data
//            String insertData =
//                "INSERT INTO Employee_JDBC VALUES " +
//                "(1,'Rahul','IT',45000)," +
//                "(2,'Anita','HR',40000)," +
//                "(3,'Amit','Finance',55000)";
//
//            stmt.executeUpdate(insertData);
//            System.out.println("Data inserted");
            
            //4 update data
            String updateData =
            		"UPDATE Employee_JDBC SET Name='Jamnesh' WHERE Emp_id=2";
            
            stmt.executeUpdate(updateData);
            System.out.print("Data updated");

            // 3️ Display data
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee_JDBC");

            System.out.println("Emp_ID  Name     Dept      Salary");
            System.out.println("--------------------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("Emp_ID") + "   " +
                    rs.getString("Name") + "   " +
                    rs.getString("Dept") + "   " +
                    rs.getInt("Salary")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
