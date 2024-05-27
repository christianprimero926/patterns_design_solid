package patterns.design.solid.exercises.dip.business;

import patterns.design.solid.exercises.dip.bbdd.InventoryBBDD;

public class ControllerStack {
    private final InventoryBBDD inventory;

    public ControllerStack(InventoryBBDD inventory) {
        this.inventory = inventory;
    }

    /**
     * Nuestros sesudos estudios han descubierto que los clientes compran mas
     * productos cuando el nombre de este producto es mas largo
     * Por eso, el estoc no puede ser inferior a 100 * la longitud del nombre del producto
     * p.e: necesitamos al menos 400 mesas (mesa : 4 letras) y
     *    al menos 700 lamparas (lampara: 7 letras)
     */
    public boolean needSet(String shop, String product) {
        int quantityCurrent = inventory.numberProducts(shop, product);

        return  quantityCurrent < product.length() * 100;
    }

}
