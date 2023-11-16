package CakeControl;

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
    private static Date fecNac;
    private static int cantCompra; //Cantidad de compras realizadas por el cliente

    public Socio() {
    }

    public Socio(int numrun, char dvrun, String nombre, String direccion, String celular, String correo, Date fecNac, int cantCompra) {
        this.numrun = numrun;
        this.dvrun = dvrun;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.fecNac = fecNac;
        this.cantCompra = cantCompra;
    }

    public int getNumrun() {
        return numrun;
    }

    public void setNumrun(int numrun) {
        this.numrun = numrun;
    }

    public char getDvrun() {
        return dvrun;
    }

    public void setDvrun(char dvrun) {
        this.dvrun = dvrun;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public void setCantCompra(int cantCompra) {
        this.cantCompra = cantCompra;
    }
    
}
