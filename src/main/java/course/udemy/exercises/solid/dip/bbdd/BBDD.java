package course.udemy.exercises.solid.dip.bbdd;

import java.util.HashMap;
import java.util.Map;

public class BBDD {
    // ----- esta es nuestra "base de datos" -----
    public static Map<String, Map<String, Integer>> stacks = new HashMap<>();

    static {
        Map<String, Integer> stocTiendaNorte = new HashMap<>();
        stocTiendaNorte.put("lampara", 600);
        stocTiendaNorte.put("mesa", 500);

        stacks.put("tienda norte", stocTiendaNorte);
    }
}
