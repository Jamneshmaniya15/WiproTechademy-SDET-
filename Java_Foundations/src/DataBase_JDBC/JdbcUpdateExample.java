package DataBase_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdateExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "UPDATE employees SET salary = ? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setDouble(1, 65000);
            statement.setInt(2, 101);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Employee salary updated successfully");
            } else {
                System.out.println("Employee not found");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}