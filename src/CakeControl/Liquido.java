
package CakeControl;

/**
 *
 * @author Eduardo Reyes
 * @version 05-11-2023
 */
public class Liquido extends Ingrediente {
    private String tipoLiquido;

    public Liquido(String tipoLiquido) {
        this.tipoLiquido = tipoLiquido;
    }

    public Liquido(String tipoLiquido, int codigo, int valorCosto, int stock, String unMedida, String nombre, String marca) {
        super(codigo, valorCosto, stock, unMedida, nombre, marca);
        this.tipoLiquido = tipoLiquido;
    }

    public String getTipoLiquido() {
        return tipoLiquido;
    }

    public void setTipoLiquido(String tipoLiquido) {
        this.tipoLiquido = tipoLiquido;
    }

    @Override
    public String toString() {
        return "Liquido{" + "tipoLiquido=" + tipoLiquido + '}'+super.toString();
    }
    
    
    
    
}
