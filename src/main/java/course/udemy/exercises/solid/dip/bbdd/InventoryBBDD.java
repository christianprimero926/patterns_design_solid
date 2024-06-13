package course.udemy.exercises.solid.dip.bbdd;

import course.udemy.exercises.solid.dip.business.InventoryService;

public class InventoryBBDD implements InventoryService {

    // Metodo de consulta a la base de datos
    @Override
    public int numberProducts(String shop, String product) {
        return BBDD.stacks.get(shop).get(product);
    }


}
