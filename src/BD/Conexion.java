package BD;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Nicolás Carmona y Eduardo Reyes
 */
public class Conexion {
    
    public static void main(String[] args) {
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            System.out.println("Conexión exitosa");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void realizarConexion(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

