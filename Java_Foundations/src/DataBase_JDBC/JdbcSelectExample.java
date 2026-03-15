package DataBase_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelectExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM employees";

            ResultSet result = statement.executeQuery(query);

            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("name");
                double salary = result.getDouble("salary");

                System.out.println(id + " " + name + " " + salary);
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}