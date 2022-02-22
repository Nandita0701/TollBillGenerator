package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user;
public class USerData {

    public int registerUser(user us) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employees" +
            "  (first_name, last_name,email, username, password, address, contact) VALUES " +
            " ( ?, ?, ?,?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/world", "root", "monisa");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, us.getFirstName());
            preparedStatement.setString(2,us.getLastName());
            preparedStatement.setString(3,us.getEmail());
            preparedStatement.setString(4, us.getUsername());
            preparedStatement.setString(5,us.getPassword());
            preparedStatement.setString(6, us.getAddress());
            preparedStatement.setString(7,us.getContact());

           
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            System.out.println("Your Details are submitted uccessfully");
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
