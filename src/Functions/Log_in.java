package Functions;
public class Log_in 
        
{
    public static String db_name = "inv_manager_db";
    public static String db_con = "jdbc:mysql://localhost:3306/" + db_name;
    public static final String inv_user = "root";
    public static final String inv_password = "";
    public static String table1= "inv_user_tbl";
    public static String table2 = "inv_prod_tbl";
    private static Object SecAnswers;
    private static String c_Name;
    private static boolean ins_act;
private String User_Pname;    
private String User_Nme;
private String OUser_pass;
private String NUser_pass;
private String c_date;
private String c_pass;
private String cc_name;
private String new_pName;
private String sec_answer;
private static String email;
private String tableInputA;
private String tableInputB;
private String searchInputA;
private String searchInputB;

    public String getSearchInputA() {
        return searchInputA;
    }

    public void setSearchInputA(String searchInputA) {
        this.searchInputA = searchInputA;
    }

    public String getSearchInputB() {
        return searchInputB;
    }

    public void setSearchInputB(String searchInputB) {
        this.searchInputB = searchInputB;
    }

    public String getTableInputA() {
        return tableInputA;
    }

    public void setTableInputA(String tableInputA) {
        this.tableInputA = tableInputA;
    }

    public String getTableInputB() {
        return tableInputB;
    }

    public void setTableInputB(String tableInputB) {
        this.tableInputB = tableInputB;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Log_in.email = email;
    }

    public String getSec_answer() {
        return sec_answer;
    }

    public void setSec_answer(String sec_answer) {
        this.sec_answer = sec_answer;
    }

    public String getNew_pName() {
        return old_pName;
    }

    public void setNew_pName(String old_pName) {
        this.old_pName = old_pName;
    }
private static String old_pName;
private static int new_pQty;
    
    public static String getOld_pName() {
        return old_pName;
    }

    public static void setOld_pName(String new_pName) {
        Log_in.old_pName = new_pName;
    }

    public static int getNew_pQty() {
        return new_pQty;
    }

    public static void setNew_pQty(int new_pQty) {
        Log_in.new_pQty = new_pQty;
    }

    public String getC_pass() {
        return c_pass;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }

    public String getCc_name() {
        return cc_name;
    }

    public void setCc_name(String cc_name) {
        this.cc_name = cc_name;
    }

    public static boolean isIns_act() {
        return ins_act;
    }

    public static void setIns_act(boolean ins_act) {
        Log_in.ins_act = ins_act;
    }


    public String getUser_Pname() {
        return User_Pname;
    }
    
    public void setUser_Pname(String User_Pname) {
        this.User_Pname = User_Pname;
    }

    public String getUser_Nme() {
        return User_Nme;
    }

    public void setUser_Nme(String User_Nme) {
        this.User_Nme = User_Nme;
    }

    public String getOUser_pass() {
        return OUser_pass;
    }

    public String getNUser_pass() {
        return NUser_pass;
    }

    public void setNUser_pass(String NUser_pass) {
        this.NUser_pass = NUser_pass;
    }

    public void setOUser_pass(String User_pass) {
        this.OUser_pass = User_pass;
    }
    public String getC_date() {
        return c_date;
    }

    public void setC_date(String c_date) {
        this.c_date = c_date;
    }
    
    public static void setC_Name(String C_Name){
        Log_in.c_Name = C_Name;
    }
    
    public static String getC_Name(){
        return c_Name;
    }
}
