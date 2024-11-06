package SQL_Conn;
import Functions.Log_in;
import GUI_Forms.User_Admin_Panel;
import GUI_Forms.User_ForgotPass;
import GUI_Forms.User_ForgotPassModifier;
import GUI_Forms.User_TableView_Panel;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQL_Conn {
    //objects initiators
    Log_in user = new Log_in();
    
//db initiators    
    public void disableAccount(String id, String name) throws SQLException{
        Connection conn1 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
        String disAcc = "Update " + Log_in.table1 +" set isActive = ? where id = ?";
        PreparedStatement prepstat = conn1.prepareStatement(disAcc);
        prepstat.setString(1, "NO");
        prepstat.setInt(2, Integer.parseInt(id));
        prepstat.executeQuery();
    }
    
    public static boolean LogInChecker(String targetEmail, String targetPass) {
            String auth = "";
            String getM = "1";
            String getP = "2";
            boolean wrong_auth = false;
            String active = "";
        try {
            Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            String sql = "SELECT authority FROM inv_user_tbl where email = ? and password = ?";
            PreparedStatement preps = conn3.prepareStatement(sql);
            preps.setString(1, targetEmail);
            preps.setString(2, targetPass);
            ResultSet rs = preps.executeQuery();
            
            String sql1 = "SELECT email,password, isActive FROM inv_user_tbl where email = ? and password = ?";
            PreparedStatement prep1 = conn3.prepareStatement(sql1);
            prep1.setString(1, targetEmail);
            prep1.setString(2, targetPass);
            ResultSet rs1 = prep1.executeQuery();
                while (rs.next()){
                if (rs1.next()){
                    active=rs1.getString("isActive");
                    if (active.equals("YES")){
                        
                        getM= rs1.getString(1);
                        getP= rs1.getString(2);
                        if (targetEmail.equals(getM) && targetPass.equals(getP)){
                            if (rs.getString(1).equals("Admin")) {
                                new User_Admin_Panel().setVisible(true);
                            }else if (rs.getString(1).equals("Viewer")){
                                new User_TableView_Panel().setVisible(true);
                            }
                            wrong_auth = true;
                        }else wrong_auth = false;
                    }
                    
                }
            }
            conn3.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "something's wrong I can feel it", "I'm not sure what's wrong", 0);
        }
        return wrong_auth;
    }
    
    public static boolean dbUpdChecker(String email, String pass){
        String mail = "1";
        String pss = "2";
        try {
            String checker = "select email, password from " + Log_in.table1 + " where email = ? and password = ?";
            Connection nConn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement u_Upd= nConn.prepareStatement(checker);
            u_Upd.setString(1, email);
            u_Upd.setString(2,pass);
            ResultSet rs = u_Upd.executeQuery();
            rs.next();
            mail = rs.getString(1);
            pss = rs.getString(2);
            nConn.close();
            return mail.equals(email) && pss.equals(pass);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Help me", 0);
        }
        return false;
    }
    
    public static void dbDeleteOrDisable(String email, String pass){
        String mail = "1";
        String pss = "2";
        try {
            String checker = "select email, password from " + Log_in.table1 + " where email = ? and password = ?";
            Connection nConn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement u_Upd= nConn.prepareStatement(checker);
            u_Upd.setString(1, email);
            u_Upd.setString(2,pass);
            ResultSet rs = u_Upd.executeQuery();
            rs.next();
            mail = rs.getString(1);
            pss = rs.getString(2);
            if (mail.equals(email) && pss.equals(pass)){
                String upd = "update " + Log_in.table1+" set isActive = 'no' where email= ?";
                PreparedStatement del = nConn.prepareStatement(upd);
                del.setString(1, mail);
                del.executeUpdate();
                nConn.close();
            }else{
                JOptionPane.showMessageDialog(null, "Email/ Password not found", "Why?", 0);
            }
        }catch (SQLException ex) {
            Logger.getLogger(SQL_Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dbProdUpd(String oldPname, String newPname,int newQty){
        LocalDate today = LocalDate.now();
        try {
            Connection conn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            String runnable = "Update inv_prod_tbl set product_name = ?, product_quantity = ?, date = ? where product_name = ?";
            PreparedStatement prep= conn.prepareStatement(runnable);
            prep.setString(1, newPname);
            prep.setInt(2, newQty);
            prep.setDate(3, java.sql.Date.valueOf(today));
            prep.setString(4, oldPname);
            prep.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQL_Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dbProdDel(String CPname, String newQty){
        LocalDate today = LocalDate.now();
        
        try {
            Connection conn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            String runnable= "Update inv_prod_tbl set product_quantity = ?, date = ? where product_name = ?";
            PreparedStatement prep= conn.prepareStatement(runnable);
            prep.setString(3, CPname);
            prep.setDate(2, java.sql.Date.valueOf(today));
            prep.setInt(1, Integer.parseInt(newQty));
            prep.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQL_Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void dbForgorPassValidation(String email, String Squestion, String Sanswer){
        try{    
            String sql = "SELECT * FROM inv_user_tbl WHERE email = ? and security_question = ? AND security_answer = ?";
            Connection conn = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, email);
            prep.setString(2, Squestion);
            prep.setString(3, Sanswer);
            ResultSet rs = prep.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null,"USER VALIDATED.");
                new User_ForgotPassModifier().setVisible(true);
                new User_ForgotPass().setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null,"Incorrect security question or answer.");
              
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         
}
     public static void dbChangePass(String email, String newpass){
         try{
        String sql = "UPDATE " + Log_in.table1 + " SET password = ? WHERE email = ?";
        Connection userconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
        PreparedStatement prep = userconn.prepareStatement(sql);
            prep.setString(1, newpass);
            prep.setString(2, email); 
            int rowsUpdated = prep.executeUpdate();
            if (rowsUpdated > 0) {
              JOptionPane.showMessageDialog(null,"Password changed successfully!");
            } else {
              JOptionPane.showMessageDialog(null,"Failed to change password.");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
     }
}
      public static double dbTotalName(String Replace){
         try{
        String runnable = "SELECT SUM(gross_sales_value) from inv_prod_tbl where product_name = ? ";
        Connection userconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
        PreparedStatement userInsert = userconn.prepareStatement(runnable);
        userInsert.setString(1, Replace);
        ResultSet resultSet = userInsert.executeQuery();
        if(resultSet.next()){
            return resultSet.getDouble(1);
        }
        
     }catch (SQLException ex){
            System.out.println(ex.getMessage());
        } 
        return 0;
      }
      
      public static double dbTotalDate(String what){
          try{
        String runnable = "SELECT SUM(gross_sales_value) from inv_prod_tbl where date = ? ";
        Connection userconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Log_in.db_name, Log_in.inv_user, Log_in.inv_password);
        PreparedStatement userInsert = userconn.prepareStatement(runnable);
        userInsert.setString(1, what);
        ResultSet resultSet = userInsert.executeQuery();
        if(resultSet.next()){
            return resultSet.getDouble(1);
        }
        
     }catch (SQLException ex){
            System.out.println(ex.getMessage());
        } 
        return 0;
      }
      
      }
      
      

//riri