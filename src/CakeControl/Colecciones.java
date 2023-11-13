package CakeControl;

import java.util.ArrayList;

/**
 *
 * @author Nicolás
 */
public class Colecciones {
    ArrayList<Ingrediente> colIngrediente = new ArrayList<>();
    ArrayList<Receta> colReceta = new ArrayList<>();
    ArrayList<Socio> colSocio = new ArrayList<>();

    public Colecciones() {
    }
    
    public void agregarIngrediente(Ingrediente ingrediente){
        colIngrediente.add(ingrediente);
    }
    public void agregarReceta(Receta receta){
        colReceta.add(receta);
    }
    public void agregarSocio(Socio socio){
        colSocio.add(socio);
    }
}
