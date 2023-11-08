
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 05-11-2023
 */
public class Ingrediente {
    protected int codigo;
    protected int valorCosto;
    protected int stock;
    protected String unMedida;
    protected String nombre;
    protected String marca;

    public Ingrediente() {
    }

    public Ingrediente(int codigo, int valorCosto, int stock, String unMedida, String nombre, String marca) {
        this.codigo = codigo;
        this.valorCosto = valorCosto;
        this.stock = stock;
        this.unMedida = unMedida;
        this.nombre = nombre;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getUnMedida() {
        return unMedida;
    }

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "codigo=" + codigo + ", valorCosto=" + valorCosto + ", stock=" + stock + ", unMedida=" + unMedida + ", nombre=" + nombre + ", marca=" + marca + '}';
    }
    
    
   
            
    
    
}
