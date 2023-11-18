package CakeControl;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Nicolás
 */
public class Socio {
    private static int numrun;
    private static char dvrun;
    private static String nombre;
    private static String direccion;
    private static String celular;
    private static String correo;
    private static LocalDate fecNac;
    private static int cantCompra; //Cantidad de compras realizadas por el cliente
    
    public Socio() {
    }

    public Socio(int numrun, char dvrun, String nombre, String direccion, String celular, String correo, Date fecNac, int cantCompra) {
        Socio.numrun = numrun;
        Socio.dvrun = dvrun;
        Socio.nombre = nombre;
        Socio.direccion = direccion;
        Socio.celular = celular;
        Socio.correo = correo;
        Socio.cantCompra = cantCompra;
    }

    public int getNumrun() {
        return numrun;
    }

    public void setNumrun(int numrun) {
        Socio.numrun = numrun;
    }

    public char getDvrun() {
        return dvrun;
    }

    public void setDvrun(char dvrun) {
        Socio.dvrun = dvrun;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Socio.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        Socio.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        Socio.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        Socio.correo = correo;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        Socio.fecNac = fecNac;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public void setCantCompra(int cantCompra) {
        Socio.cantCompra = cantCompra;
    }
    
}
