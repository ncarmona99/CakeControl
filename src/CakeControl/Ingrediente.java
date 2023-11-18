
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 05-11-2023
 */
public class Ingrediente {
    private static int codigo; // Autoincremental por la BD
    private static String nombre;
    private static String descripcion; // Se incluyen comentarios extras
    private static String marca; 
    private static int valorCosto; //Considera IVA
    private static int stock;

    public Ingrediente() {
    }

    public Ingrediente(int codigo, String nombre, String descripcion, String marca, int valorCosto, int stock, int canMedida, String unMedida) {
        Ingrediente.codigo = codigo;
        Ingrediente.nombre = nombre;
        Ingrediente.descripcion = descripcion;
        Ingrediente.marca = marca;
        Ingrediente.valorCosto = valorCosto;
        Ingrediente.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValorCosto() {
        return valorCosto;
    }

    public void setValorCosto(int valorCosto) {
        this.valorCosto = valorCosto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
        
}
