package course.udemy.exercises.solid.isp;

import java.util.ArrayList;
import java.util.List;

public class ProcessorText implements AdvancedTextProcessor {
    private final List<String> text = new ArrayList<>();


    @Override
    public boolean correct(Language language) {
        for (String word : text) {
            if (!language.diccionario.contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void newWord(String word) {
        text.add(word);
    }

    @Override
    public String text() {
        return String.join(" ", text);
    }
}
