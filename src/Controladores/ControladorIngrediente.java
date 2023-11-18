package Controladores;

import CakeControl.Ingrediente;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Nicolás Carmona, Eduardo Reyes, Sebastián Benavente
 */
public class ControladorIngrediente {
    Ingrediente ingrediente = new Ingrediente();
    Connection connection = null;
    
    public void crearIngrediente(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "INSERT INTO ingrediente(nombre_ing,descripcion_ing,stock_ing,precio_ing,marca_ing)"
                    + " values('"+ingrediente.getNombre()+"','"+ingrediente.getDescripcion()+"','"+ingrediente.getStock()+"','"+ingrediente.getValorCosto()+"','"+ingrediente.getMarca()+"')";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Ingrediente creado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al crear ingrediente");
        }
        
    }
    
    public void modificarIngrediente(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "UPDATE ingrediente SET nombre_ing='"+ingrediente.getNombre()+"',descripcion_ing='"+ingrediente.getDescripcion()+"',precio_ing='"+ingrediente.getValorCosto()+"',marca_ing='"+ingrediente.getMarca()+"' WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Ingrediente modificado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al modificar ingrediente");
        }
        
    }
    
    public void borrarIngrediente(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "DELETE FROM ingrediente WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Ingrediente borrado correctamente");
            ingrediente.setCodigo(0);
            ingrediente.setDescripcion(null);
            ingrediente.setMarca(null);
            ingrediente.setNombre(null);
            ingrediente.setStock(0);
            ingrediente.setValorCosto(0);
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al borrar ingrediente");
        }
        
    }
    
    public void buscarIngrediente(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT * FROM ingrediente WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                ingrediente.setNombre(rs.getString("nombre_ing"));
                ingrediente.setDescripcion(rs.getString("descripcion_ing"));
                ingrediente.setStock(rs.getInt("stock_ing"));
                ingrediente.setValorCosto(rs.getInt("precio_ing"));
                ingrediente.setMarca(rs.getString("marca_ing"));
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al buscar Ingrediente");
        }
    }
    public void buscarIngRecepcion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT * FROM ingrediente WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                ingrediente.setNombre(rs.getString("nombre_ing"));
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al buscar el ingrediente");
        }
    }
    public void recepcionarIngrediente(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "UPDATE ingrediente SET stock_ing='"+ingrediente.getStock()+"' WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Recepción efectuada correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al realizar la recepción");
        }
    }
    public void stockAct(){  //Método que llama el stock actualziado de la BD
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT stock_ing FROM ingrediente WHERE cod_ing = '"+ingrediente.getCodigo()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                ingrediente.setStock(rs.getInt("stock_ing"));
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al realizar la recepción");
        }
    }
}
