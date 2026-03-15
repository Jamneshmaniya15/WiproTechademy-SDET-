package DataBase_JDBC;

import java.sql.*;

public class DatabaseOperationsManager {

    private static final String URL = "jdbc:mysql://localhost:3306/Employee_db";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("[CONNECTED] Successfully linked to Employee_db");

            // 1. Create Table (DDL)
            executeTableCreation(con);

            // 2. Perform CRUD Operations (DML)
            performUpdate(con, 2, "Jamnesh");

            // 3. Fetch Data using Standard Statement
            fetchEmployeeData(con);

            // 4. Call Stored Procedure (Demonstrating CallableStatement from jdbcEx3)
            callEmployeeStoredProcedure(con);

        } catch (Exception e) {
            System.err.println("[DATABASE ERROR] " + e.getMessage());
        }
    }

    private static void executeTableCreation(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Employee_JDBC (" +
                     "Emp_ID INT PRIMARY KEY, Name VARCHAR(50), Dept VARCHAR(50), Salary INT)";
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(sql);
        }
    }

    private static void performUpdate(Connection con, int id, String newName) throws SQLException {
        String sql = "UPDATE Employee_JDBC SET Name = ? WHERE Emp_ID = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            int rows = pstmt.executeUpdate();
        }
    }

    private static void fetchEmployeeData(Connection con) throws SQLException {
        String sql = "SELECT * FROM Employee_JDBC";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n Current Employee List");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %d%n",
                        rs.getInt("Emp_ID"), rs.getString("Name"), 
                        rs.getString("Dept"), rs.getInt("Salary"));
            }
        }
    }

    private static void callEmployeeStoredProcedure(Connection con) throws SQLException {
        try (CallableStatement cs = con.prepareCall("{CALL getAllEmployees()}")) {
            System.out.println("\n Executing getAllEmployees...");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                System.out.println("Proc Result -> " + rs.getString("name"));
            }
        }
    }
}