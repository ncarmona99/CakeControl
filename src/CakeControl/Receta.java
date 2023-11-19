package CakeControl;

/**
 *
 * @author Nicolas
 */
public class Receta {
    private static int codReceta;
    private static String nombreReceta;
    private static int valorReceta;
    

    public Receta() {
    }

    public Receta(int codReceta, String nombreReceta, int valorReceta) {
        this.codReceta = codReceta;
        this.nombreReceta = nombreReceta;
        this.valorReceta = valorReceta;
    }

    public int getCodReceta() {
        return codReceta;
    }

    public void setCodReceta(int codReceta) {
        this.codReceta = codReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public int getvalorReceta() {
        return valorReceta;
    }

    public void setvalorReceta(int valorReceta) {
        this.valorReceta = valorReceta;
    }

   
    
    
    
    
}
