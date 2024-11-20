package Databases;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class databases {
    public static void createDb() throws SQLException{
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/"; // Replace with your database URL
        String url2 = "jdbc:mysql://localhost:3306/SENDS";
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password
        String createSENDSDb = "Create database if not exists SENDS";
        String useSENDSDb = "use SENDS";
        String makeTablePeople= "create table people(id int auto_increment primary key, last_name varchar(50), first_name varchar(50), address varchar(100), contact_Number varchar(11) unique)";
        String makeTableAdmin= "create table admin (id int auto_increment primary key, username varchar(20) unique not null, password varchar(10) not null)";
        Connection conn = null;
        Connection conn2 = null ;
        try{
            // Establish connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
            Statement statement = conn.createStatement();
            conn2 = DriverManager.getConnection(url2, username, password);
            Statement statement2 = conn2.createStatement();
            statement.execute(createSENDSDb);
            statement.execute(useSENDSDb);
            statement2.executeUpdate(makeTablePeople);
            statement2.execute(makeTableAdmin);
        }finally{
            conn.close();
            conn2.close();
        }
        
    }
    public static void dbMake(){
        try {
            createDb();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
