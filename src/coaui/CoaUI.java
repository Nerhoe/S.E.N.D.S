/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coaui;
import UI.TableView;
import UI.Login;
import Databases.sqlConnetor;
import javax.swing.JFrame;

public class CoaUI {
    SQLConnector db = new SQLConnector();
    public static void main(String[] args) {
        runUI();
        db.createDb();
    }
    static void runUI(){
        Login login = new Login();
        login.setVisible(true);
    }
}
