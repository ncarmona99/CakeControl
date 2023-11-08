
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 05-11-2023
 */
public class Harina extends Ingrediente {
    private String tipoProducto;

    public Harina() {
    }

    public Harina(String tipoProducto, int codigo, int valorCosto, int stock, String unMedida, String nombre, String marca) {
        super(codigo, valorCosto, stock, unMedida, nombre, marca);
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Harina{" + "tipoProducto=" + tipoProducto + '}'+ super.toString();
    }
        
    
    
}
