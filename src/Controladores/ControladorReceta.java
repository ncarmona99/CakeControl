
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
    
    public void buscarReceta(){ //Método que busca un socio a partir del numrun de la persona
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT nombre_receta,valor_receta FROM receta WHERE cod_receta = '"+receta.getCodReceta()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                receta.setNombreReceta(rs.getString("nombre_receta"));
                receta.setvalorReceta(Integer.parseInt(rs.getString("valor_receta")));
                
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al buscar receta");
        }
    }
    
    
}
