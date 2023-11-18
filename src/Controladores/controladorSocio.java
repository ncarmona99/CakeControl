package Controladores;

import CakeControl.Socio;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

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
            String query = "INSERT INTO socio(numrun_socio,dvrun_socio,nombre_socio,direccion_socio,celular_socio,correo_socio,numcompras_socio,fecnac_socio)"
                    + " values('"+socio.getNumrun()+"','"+socio.getDvrun()+"','"+socio.getNombre()+"','"+socio.getDireccion()+"','"+socio.getCelular()+"','"+socio.getCorreo()+"','"+socio.getCantCompra()+"','"+socio.getFecNac()+"')";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Socio agregado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al agregar socio");
        }
        
    }
    
    public void modificarSocio(){ //Método que modifica un socio a partir del numrun de la persona
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "UPDATE socio SET nombre_socio='"+socio.getNombre()+"',direccion_socio='"+socio.getDireccion()+"',celular_socio='"+socio.getCelular()+"',correo_socio='"+socio.getCorreo()+"',fecnac_socio='"+socio.getFecNac()+"' WHERE numrun_socio = '"+socio.getNumrun()+"'";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Socio modificado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al modificar socio");
        }
    }
    
    public void buscarSocio(){ //Método que busca un socio a partir del numrun de la persona
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT nombre_socio,direccion_socio,celular_socio,correo_socio,fecnac_socio FROM socio WHERE numrun_socio = '"+socio.getNumrun()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                socio.setNombre(rs.getString("nombre_socio"));
                socio.setDireccion(rs.getString("direccion_socio"));
                socio.setCelular(rs.getString("celular_socio"));
                socio.setCorreo(rs.getString("correo_socio"));
                socio.setFecNac(rs.getDate("fecnac_socio").toLocalDate());
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al buscar al socio");
        }
    }
    
    public void borrarSocio(){ //Método que borra un socio a partir del numrun de la persona
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "DELETE FROM socio WHERE numrun_socio = '"+socio.getNumrun()+"'";
            connection.createStatement().executeUpdate(query);
            socio.setCantCompra(0);
            socio.setCelular(null);
            socio.setCorreo(null);
            socio.setDireccion(null);
            socio.setNombre(null);
            socio.setFecNac(null);
            
            JOptionPane.showMessageDialog(null, "Socio desvinculado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al desvincular socio");
        }
    }
}
