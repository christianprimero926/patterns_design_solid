package patterns.design.solid.exercises.isp;

import java.util.Arrays;
import java.util.List;

public enum Language {
    EN("I", "am", "angry"),
    ES("tengo", "hambre"),
    CA("tenc", "fam");

    List<String> diccionario;

    Language(String... words) {
        this.diccionario = Arrays.asList(words);
    }
}
