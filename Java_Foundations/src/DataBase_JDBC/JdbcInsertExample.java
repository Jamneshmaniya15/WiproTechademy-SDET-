package DataBase_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, 101);
            statement.setString(2, "Jamnesh");
            statement.setDouble(3, 50000);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}