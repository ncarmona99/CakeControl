
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 05-11-2023
 */
public class Ingrediente {
    private int codigo; // Autoincremental por la BD
    private String nombre;
    private String descripcion; // Se incluyen comentarios extras
    private String marca; 
    private int valorCosto; //Considera IVA
    private int stock;
    private int canMedida; //Cantidad en gramos o ml
    private String unMedida; //Unidad de medida a utilizar

    public Ingrediente() {
    }

    public Ingrediente(int codigo, String nombre, String descripcion, String marca, int valorCosto, int stock, int canMedida, String unMedida) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.valorCosto = valorCosto;
        this.stock = stock;
        this.canMedida = canMedida;
        this.unMedida = unMedida;
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

    public int getCanMedida() {
        return canMedida;
    }

    public void setCanMedida(int canMedida) {
        this.canMedida = canMedida;
    }

    public String getUnMedida() {
        return unMedida;
    }

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }
    
    
}
