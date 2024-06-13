package course.udemy.exercises.solid.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProcessorTextTest {
    @Test
    void test_simple() {

        BasicTextProcessor processor = new ProcessorText();

        processor.newWord("No");
        processor.newWord("himporta");
        processor.newWord("la");
        processor.newWord("hortografia");

        assertEquals("No himporta la hortografia", processor.text());
    }

    @Test
    void test_with_language() {

        AdvancedTextProcessor processor = new ProcessorText();

        processor.newWord("Tengo");
        processor.newWord("hambre");

        assertEquals("Tengo hambre", processor.text());

        assertTrue(processor.correct(Language.ES));
    }
}