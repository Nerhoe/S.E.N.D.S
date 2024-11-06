/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL_Conn;

import Functions.Log_in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaron
 */
public class DFTs {
    public DefaultTableModel lists(String pName, String pDate){
        String[] c_name = {"Product Name", "Product Quantity in Stock"," Price ", "Date","Total Item Vollume","Item Revenue"};
        DefaultTableModel dft = new DefaultTableModel(c_name, 0);
        if (pName.equals("") && pDate.equals("")){
            try {
               dft.setRowCount(0);
               DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
               Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
               String sql = "SELECT product_name, product_quantity_InStock, price , date, sales_volume, gross_sales_value FROM `inv_prod_tbl` where not product_quantity_InStock = 0 order by date";
              PreparedStatement preps = conn3.prepareStatement(sql);
              ResultSet rs = preps.executeQuery();
               int columnCount = rs.getMetaData().getColumnCount();
              String[] rowData = new String[columnCount];
              while(rs.next()){
                     for (int i= 1; i <= columnCount; i++){
                       rowData[i-1] = rs.getString(i);
                    }
                  dft.addRow(rowData);
              }
              conn3.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if ((!(pName.equals(""))) && ((pDate.equals("")))){
            try {
                dft.setRowCount(0);
                DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "SELECT product_name, product_quantity_InStock, price, date, sales_volume, gross_sales_value FROM `inv_prod_tbl` where product_name like ? and not product_quantity_InStock = 0 order by product_name";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pName+ "%");
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if (((pName.equals(""))) && (!(pDate.equals("")))){
            try {
                dft.setRowCount(0);
                 DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "select product_name, product_quantity_InStock, price, date, sales_volume, gross_sales_value from inv_prod_tbl WHERE date LIKE ? and not product_quantity_InStock = 0 order by product_name";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pDate);
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if (!((pName.equals(""))) && (!(pDate.equals("")))){
            try {
                dft.setRowCount(0);
                 DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "select product_name, product_quantity_InStock,price , date, sales_volume, gross_sales_value from inv_prod_tbl WHERE date LIKE ? and product_name like ? and not product_quantity_InStock = 0 order by product_name";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pDate);
                preps.setString(2 ,pName+ "%");
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return dft;
        
    }
    
    public DefaultTableModel alists(String pName, String pDate){
        String[] c_name = {"Transaction ID", "Product Name", "Product Quantity in Stock","Price" ,"Date","Total Item Vollume","Item Revenue"};
        DefaultTableModel dft = new DefaultTableModel(c_name, 0);
        System.out.println((!(pName.equals(""))) && ((pDate.equals(""))));
        System.out.println(pDate);
        if (pName.equals("") && pDate.equals("")){
            try {
              dft.setRowCount(0);
              DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
              Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
              String sql = "SELECT * FROM `inv_prod_tbl` order by transaction_id";
              PreparedStatement preps = conn3.prepareStatement(sql);
              ResultSet rs = preps.executeQuery();
              int columnCount = rs.getMetaData().getColumnCount();
              String[] rowData = new String[columnCount];
              while(rs.next()){
                     for (int i= 1; i <= columnCount; i++){
                       rowData[i-1] = rs.getString(i);
                    }
                  dft.addRow(rowData);
              }
              conn3.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if ((!(pName.equals(""))) && ((pDate.equals("")))){
            try {
                dft.setRowCount(0);
                 DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "SELECT * FROM `inv_prod_tbl` where product_name like ? order by product_name";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pName+ "%");
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if (((pName.equals(""))) && (!(pDate.equals("")))){
            try {
                dft.setRowCount(0);
                DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "select * from inv_prod_tbl WHERE date LIKE ? order by transaction_id";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pDate);
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }else if (!((pName.equals(""))) && (!(pDate.equals("")))){
            System.out.println("help");
            try {
                dft.setRowCount(0);
                DatabaseConnectionInnit dci = new DatabaseConnectionInnit();
                Connection conn3 = DriverManager.getConnection(Log_in.db_con, Log_in.inv_user, Log_in.inv_password);
                String sql = "select * from inv_prod_tbl WHERE date LIKE ? and product_name like ? order by product_name";
                PreparedStatement preps = conn3.prepareStatement(sql);
                preps.setString(1, pDate);
                preps.setString(2, pName+"%");
                ResultSet rs = preps.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                String[] rowData = new String[columnCount];
                while(rs.next()){
                        for (int i= 1; i <= columnCount; i++){
                        rowData[i-1] = rs.getString(i);
                    }
                    dft.addRow(rowData);
                }
                conn3.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return dft;
    }
}
