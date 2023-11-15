package Controladores;

import BD.Conexion;
import CakeControl.Socio;
import Vistas.Socios.MenuRegistrarSocio;

/**
 *
 * @author Nicolás
 */
public class controladorSocio {
    MenuRegistrarSocio menuRegistrarSocio = new MenuRegistrarSocio();
    
    public void ingresarSocio(){
    Conexion conexion = new Conexion();
    conexion.realizarConexion();
    System.out.println(menuRegistrarSocio.getJtxt_numrun().getText());
    }
}
