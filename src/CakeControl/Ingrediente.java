
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 08-11-2023
 */
public class Ingrediente {
    private int codigo;
    private int valorCosto;
    private int stock;
    private int mlOGr;
    private String unMedida;
    private String nombre;
    private String marca;
    private String categoria;
    private String caracteristica;

    public Ingrediente() {
    }

    public Ingrediente(int codigo, int valorCosto, int stock, int mlOGr, String unMedida, String nombre, String marca, String categoria, String caracteristica) {
        this.codigo = codigo;
        this.valorCosto = valorCosto;
        this.stock = stock;
        this.mlOGr = mlOGr;
        this.unMedida = unMedida;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.caracteristica = caracteristica;
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

    public int getMlOGr() {
        return mlOGr;
    }

    public void setMlOGr(int mlOGr) {
        this.mlOGr = mlOGr;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "codigo=" + codigo + ", valorCosto=" + valorCosto + ", stock=" + stock + ", mlOGr=" + mlOGr + ", unMedida=" + unMedida + ", nombre=" + nombre + ", marca=" + marca + ", categoria=" + categoria + ", caracteristica=" + caracteristica + '}';
    }
    
    
    
    
    
    
    

}
