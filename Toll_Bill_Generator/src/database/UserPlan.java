package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Travel;
public class UserPlan {
    public int registerPlan(Travel t) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO traveldetails" +
            "  (StartDate,Boarding,Destination) VALUES " +
            " ( ?, ?, ?);";

        int result = 0;
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/world", "root", "monisa");

            // Step 2:Create a statement using connection object
        	
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	preparedStatement.setDate(1,(Date) t.getStartDate());
            preparedStatement.setString(2, t.getFrom());
            preparedStatement.setString(3,t.getTo());

            
            System.out.println("Stored into Database Successfully");
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

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
