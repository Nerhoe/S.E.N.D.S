package SQL_Conn.DEBUGGER_TESTER;
import SQL_Conn.DatabaseConnectionInnit;
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
public class testrunner 
{
   public static void dbDrop() throws SQLException{
        Connection disCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
        Statement exeDB = disCon.createStatement();
        exeDB.executeUpdate("drop database "+ Log_in.db_name);
        disCon.close();
        System.out.println("hehe");
    } 
}
