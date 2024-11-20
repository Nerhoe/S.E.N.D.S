package SQLConnector;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class sqlConnetor {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password

        Connection connection = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            // Close connection
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
