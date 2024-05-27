package patterns.design.solid.exercises.dip.bbdd;

public class InventoryBBDD {
    // Metodo de consulta a la base de datos

    public int numberProducts(String shop, String product) {
        return BBDD.stacks.get(shop).get(product);
    }
}
