package patterns.design.solid.exercises.dip.bbdd;

import patterns.design.solid.exercises.dip.business.InventoryService;

public class InventoryBBDD implements InventoryService {

    // Metodo de consulta a la base de datos
    @Override
    public int numberProducts(String shop, String product) {
        return BBDD.stacks.get(shop).get(product);
    }


}
