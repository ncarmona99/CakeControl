package Controladores;

import CakeControl.Socio;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nicolás
 */
public class controladorSocio {
    Socio socio = new Socio();
    Connection connection = null;
    
    public void ingresarSocio(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "INSERT INTO socio(numrun_socio,dvrun_socio,nombre_socio,direccion_socio,celular_socio,correo_socio,numcompras_socio)"
                    + " values('"+socio.getNumrun()+"','"+socio.getDvrun()+"','"+socio.getNombre()+"','"+socio.getDireccion()+"','"+socio.getCelular()+"','"+socio.getCorreo()+"','"+socio.getCantCompra()+"')";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Socio agregado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al agregar socio");
        }
        
    }
}
