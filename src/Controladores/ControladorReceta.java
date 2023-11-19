
package Controladores;

import CakeControl.Receta;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author reyes
 */
public class ControladorReceta {
    Receta receta = new Receta();
    Connection connection = null;

    public void crearReceta(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "INSERT INTO receta(nombre_receta,valor_receta)"
                    + " values('"+receta.getNombreReceta()+"','"+receta.getvalorReceta()+"')";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Receta creada correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al crear Receta");
        }
    }
    
    
    
    
}
