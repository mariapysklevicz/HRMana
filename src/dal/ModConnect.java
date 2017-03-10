/*
 * @author Maria Pysklevicz
 */
package dal;
import java.sql.*;


public class ModConnect {
    // conexão com banco de dodos
    public static Connection connect(){
        java.sql.Connection con = null;
        //chamada para driver
        String driver = "com.mysql.jdbc.Driver";
        //db
        String url = "jdbc:mysql://localhost:1870/rh_manage?verifyServerCertificate=false&useSSL=false&requireSSL=false";
        String user= "wicz";
        String pass= "wfbc8uxi";
        // estabelecendo conexão
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
    
}
