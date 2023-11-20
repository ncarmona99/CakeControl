package Controladores;

import CakeControl.Receta;
import CakeControl.Socio;
import CakeControl.Venta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolás Carmona
 */
public class controladorVenta {
    Receta rec = new Receta();
    Socio soc = new Socio();
    Venta vt = new Venta();
    Connection connection = null;
    
    public void buscarPreparacion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT * FROM receta WHERE cod_receta = '"+rec.getCodReceta()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                rec.setNombreReceta(rs.getString("nombre_receta"));
                rec.setValorReceta(rs.getInt("valor_receta"));
                rec.setStockReceta(rs.getInt("stock_rec"));
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al encontrar receta/preparación");
        }
    }
    
    public void buscarSocio(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "SELECT numrun_socio, dvrun_socio, numcompras_socio FROM socio WHERE numrun_socio = '"+soc.getNumrun()+"' AND dvrun_socio = '"+soc.getDvrun()+"'";
            ResultSet rs = connection.createStatement().executeQuery(query);
            if(rs.next()){
                int numrunTemp = soc.getNumrun();
                int dvTemp = soc.getDvrun();
                if(numrunTemp == soc.getNumrun() && dvTemp == soc.getDvrun()){
                    soc.setNumrun(Integer.parseInt(rs.getString("numrun_socio")));
                    soc.setDvrun(rs.getString("dvrun_socio").charAt(0));
                    soc.setCantCompra(Integer.parseInt(rs.getString("numcompras_socio")));
                }else{
                    JOptionPane.showMessageDialog(null, "El run ingresado no pertenece a ningún socio");
                }
                    
            }else{
                JOptionPane.showMessageDialog(null, "El socio no se ha encontrado en la base de datos");   
            }
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error de conexión a BD");
        }
    }
    public void actualizarCantCompra(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "UPDATE socio SET numcompras_socio='"+(soc.getCantCompra()+1)+"' WHERE numrun_socio = '"+soc.getNumrun()+"' AND dvrun_socio = '"+soc.getDvrun()+"'";
            connection.createStatement().executeUpdate(query);
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error de conexión a BD");
        }
    }
    public void actualizarStock(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "UPDATE receta SET stock_rec='"+(soc.getCantCompra())+"' WHERE numrun_socio = '"+soc.getNumrun()+"' AND dvrun_socio = '"+soc.getDvrun()+"'";
            connection.createStatement().executeUpdate(query);
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error de conexión a BD");
        }
    }
    public void ingresarVenta(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakecontrol","root", "");
            String query = "INSERT INTO venta(fec_venta,total_venta,numrun_socio) values('"+vt.getFecVenta()+"','"+vt.getTotalVenta()+"','"+soc.getNumrun()+"')";
            connection.createStatement().executeUpdate(query);
            
        }catch (Exception e){
            System.out.println("Algo salió mal: "+e);
            JOptionPane.showMessageDialog(null, "Error al registrar la venta en BD");
        }
        
    }
}
