package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.manager;
public class ManagerData{

    public int registerManager(manager m) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO Manager" +
            "  (name,email, userid, password, contact) VALUES " +
            " ( ?, ?, ?,?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/world", "root", "monisa");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, m.getName());
            preparedStatement.setString(2,m.getEmail());
            preparedStatement.setString(3, m.getUserid());
            preparedStatement.setString(4,m.getPassword());
            preparedStatement.setString(5,m.getContact());

            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            System.out.println("Your details are submitted successfully");

            
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
