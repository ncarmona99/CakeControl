package CakeControl;

/**
 *
 * @author Nicolas
 */
public class Receta {
    private int codReceta;
    private String nombreReceta;
    private int valorReceta; //Coste de venta de la receta
    private Ingrediente ingrediente;
    
    public Receta() {
    }

    public Receta(int codReceta, String nombreReceta, int valorReceta, Ingrediente ingrediente) {
        this.codReceta = codReceta;
        this.nombreReceta = nombreReceta;
        this.valorReceta = valorReceta;
        this.ingrediente = ingrediente;
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

    public int getValorReceta() {
        return valorReceta;
    }

    public void setValorReceta(int valorReceta) {
        this.valorReceta = valorReceta;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
