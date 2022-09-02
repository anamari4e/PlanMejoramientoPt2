
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Ana
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage()+"Conexión no exitosa");
        }
        
        return cn;
    }
}
