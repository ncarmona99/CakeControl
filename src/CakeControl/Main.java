package CakeControl;
/**
 *
 * @author Nicolás Carmona y Eduardo Reyes
 */
public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente(1, "Leche", "Leche colún descremada", "Colún", 1000, 1, 1000, "ml");
        Ingrediente ingrediente2 = new Ingrediente(2, "Leche", "Leche colún descremada", "Colún", 1000, 1, 1000, "ml");
        Colecciones coleccion = new Colecciones();
        coleccion.agregarIngrediente(ingrediente1);
        Receta receta1 = new Receta(1, "Torta de frutilla", 10000, ingrediente1);
    }
}

