package BD;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Nicolás Carmona y Eduardo Reyes
 */
public class Conexion {
    Connection conexion = null;
    public Connection realizarConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
}