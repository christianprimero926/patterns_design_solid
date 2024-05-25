package patterns.design.solid.exercises.isp;

import java.util.ArrayList;
import java.util.List;

public class ProcessorText {
    private final List<String> text = new ArrayList<>();

    public void newWord(String word) {
        text.add(word);
    }

    public String text() {
        return String.join(" ", text);
    }

    public boolean correct(Language language) {
        for (String word : text) {
            if (!language.diccionario.contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
