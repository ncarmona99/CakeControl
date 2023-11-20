package CakeControl;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Receta {
    private static int codReceta;
    private static String nombreReceta;
    private static int valorReceta; //Coste de venta de la receta
    private static int stockReceta;
    private static int cantReceta;
    private static int cantIng;
    
    //Lista que guarda temporalmente las recetas que se agregan en la venta
    static ArrayList <Integer> colCompra = new ArrayList<>();

    public Receta(int codReceta, String nombreReceta, int valorReceta, int stockReceta, int cantReceta, Ingrediente ingrediente) {
        Receta.codReceta = codReceta;
        Receta.nombreReceta = nombreReceta;
        Receta.valorReceta = valorReceta;
        Receta.stockReceta = stockReceta;
        Receta.cantReceta = cantReceta;
        this.ingrediente = ingrediente;
    }
    
    private Ingrediente ingrediente;
    
    public Receta() {
    }

    public int getCodReceta() {
        return codReceta;
    }

    public int getStockReceta() {
        return stockReceta;
    }

    public void setStockReceta(int stockReceta) {
        Receta.stockReceta = stockReceta;
    }

    public void setCodReceta(int codReceta) {
        Receta.codReceta = codReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        Receta.nombreReceta = nombreReceta;
    }

    public int getValorReceta() {
        return valorReceta;
    }

    public void setValorReceta(int valorReceta) {
        Receta.valorReceta = valorReceta;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getCantReceta() {
        return cantReceta;
    }

    public void setCantReceta(int cantReceta) {
        Receta.cantReceta = cantReceta;
    }

    public ArrayList<Integer> getColCompra() {
        return colCompra;
    }

    public void setColCompra(ArrayList<Integer> colCompra) {
        Receta.colCompra = colCompra;
    }

    public static int getCantIng() {
        return cantIng;
    }

    public static void setCantIng(int cantIng) {
        Receta.cantIng = cantIng;
    }
    
    
    
}