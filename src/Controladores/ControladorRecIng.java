/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import BD.Conexion;
import CakeControl.Ingrediente;
import CakeControl.Receta;
import Vistas.MenuAgregarIng;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s-e-b
 */
public class ControladorRecIng {
    
    Receta receta = new Receta();
    Ingrediente ingrediente = new Ingrediente();
    Connection connection = null;
    
    public void IngresarIng(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "INSERT INTO ingredientes_receta(cod_receta,cod_ing,cant_ingrediente)"
                    + " values('"+receta.getCodReceta()+"','"+ingrediente.getCodigo()+"','"+receta.getCantIng()+"')";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Ingrediente ingresado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al ingresar los ingredientes");
        }
    }
    
    public void nombreIng(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "select nombre_ing from ingrediente where cod_ing ='"+ ingrediente.getCodigo() +"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            
            if (rs.next()) {
                ingrediente.setNombre(rs.getString("nombre_ing"));
            }
            
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al ingresar los ingredientes");
        }
    }
    
    
    public void buscarPorCod(DefaultTableModel modelo) throws ClassNotFoundException {
        
        //trycatch+tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "select i.cod_ing, i.nombre_ing, sum(ir.cant_ingrediente) from ingrediente i JOIN ingredientes_receta ir ON i.cod_ing = ir.cod_ing where ir.cod_receta = '"+ receta.getCodReceta() +"' GROUP BY i.cod_ing, i.nombre_ing";
            ResultSet rs = connection.createStatement().executeQuery(query);

            while (rs.next()) {
                ingrediente.setCodigo(rs.getInt("i.cod_ing"));
                ingrediente.setNombre(rs.getString("i.nombre_ing"));
                receta.setCantIng(rs.getInt("sum(ir.cant_ingrediente)"));
                
                modelo.addRow(new Object[]{ingrediente.getCodigo(), ingrediente.getNombre(), receta.getCantIng()});
            }
            

        } catch (SQLException e) {
            System.out.println("Error SQL al listar libro por Id" + e.getMessage());
            
        }
        
    }
    
    public void EliminarIng(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "DELETE FROM ingredientes_receta WHERE cod_receta = '"+ receta.getCodReceta() +"' and cod_ing = '"+ ingrediente.getCodigo() +"'";
            connection.createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Ingrediente eliminado correctamente");
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al eliminar el ingrediente");
        }
    }
    
    
    
    
}
