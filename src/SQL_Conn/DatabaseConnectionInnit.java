package SQL_Conn;
import Functions.Log_in;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DatabaseConnectionInnit {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public String defaults = "viewer"; 
    //database connector/create table
    public static void dbInit(String db_name_in) throws SQLException{
        Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/", Log_in.inv_user, Log_in.inv_password);
        Statement createDB = conn1.createStatement();
        createDB.executeUpdate("create database "+ db_name_in);
        conn1.close();
        
        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name_in, Log_in.inv_user, Log_in.inv_password);
        String user_tbl = "create table "+ Log_in.table1 +" (`User_ID` int primary key not null auto_increment, `user_fName` varchar (255) not null, `user_lName` varchar (255) not null, `email` varchar (255) not null unique,`password` varchar(255) not null, `isActive` varchar(3) not null, authority varchar(10) default 'viewer', security_answer varchar(100) not null, security_question varchar(100) not null);";
        String inv_tbl = "create table "+ Log_in.table2+ " (`Transaction_ID` int primary key not null auto_increment, `product_name` varchar (255) not null,`product_quantity_InStock` int not null,`price` int not null, `date` date not null, `sales_volume` int not null, `gross_sales_value` int not null);";
                
        Statement createTable = conn2.createStatement();
        createTable.executeUpdate(inv_tbl);
        createTable.executeUpdate(user_tbl);
        conn2.close();
    }
   
    public static void dbMake(){
        try {
            dbInit(Log_in.db_name);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
       
    //user creator
    public boolean dbInsertUsers(String F_Name, String L_Name, String E_mail, String P_assword, String U_auth, String S_Answ, String S_Quest){
        String runnable = "insert into " + Log_in.table1 + " (user_fName, user_lName, email, password, isActive, authority, security_answer, security_question) values (?,?,?,?,?,?,?,?)";
        
        try{
            Connection userconn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement userInsert = userconn.prepareStatement(runnable);
            userInsert.setString(1, F_Name);
            userInsert.setString(2, L_Name);
            userInsert.setString(3, E_mail);
            userInsert.setString(4, P_assword);
            userInsert.setString(5, "YES");
            userInsert.setString(6, U_auth);
            userInsert.setString(7, S_Answ);
            userInsert.setString(8, S_Quest);
            userInsert.executeUpdate();
            userconn.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        return false;
        }
        return true;
    }
    public void dbInsertProduct(String P_Name, String P_Quantity, String CurrentDate, String Volume, String price,String total){
        try{
            
        String runnable = "insert into " + Log_in.table2 + " (product_name, product_quantity_InStock, price , date, sales_volume, gross_sales_value) values (?,?,?,?,?,?)";
        Connection userconn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement userInsert = userconn.prepareStatement(runnable);
            userInsert.setString(1, P_Name);
            userInsert.setInt(2, Integer.parseInt(P_Quantity));
            userInsert.setInt(3, Integer.parseInt(price));
            userInsert.setDate(4, java.sql.Date.valueOf(CurrentDate));
            userInsert.setInt(5, Integer.parseInt(Volume));
            userInsert.setInt(6, Integer.parseInt(total));
            
            userInsert.executeUpdate();
            userconn.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Not a number, sorry!", "Nope, definitely not number", 0);
        }
    }
    
    public void dbUpdateUserTable(String Email, String PasswordNew, String auth){
        System.out.println("this");
        try{
        String runnable = "UPDATE " + Log_in.table1 + " SET password = ?, authority = ? where email = ?";
        Connection userconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
        PreparedStatement userInsert = userconn.prepareStatement(runnable);
            userInsert.setString(1, PasswordNew);
            userInsert.setString(2,auth);
            userInsert.setString(3, Email);
            userInsert.executeUpdate();
            userconn.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }           
   }

     public static boolean dbUpdateUserVALIDATION(String email, String Password){
        try{
        String runnable = "SELECT * FROM " + Log_in.table1 + "where  email = ? and password = ?  ";
        Connection userconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement userInsert = userconn.prepareStatement(runnable);
            userInsert.setString(1, email);
            userInsert.setString(2, Password);
            userInsert.executeQuery();
            userconn.close();
        }catch (SQLException ex)
        {
            return false;
        }
        return true;
     }  
     
    
     }
     

     