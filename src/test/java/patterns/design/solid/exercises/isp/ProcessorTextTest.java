package patterns.design.solid.exercises.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProcessorTextTest {
    @Test
    void test_simple() {

        ProcessorText processor = new ProcessorText();

        processor.newWord("No");
        processor.newWord("himporta");
        processor.newWord("la");
        processor.newWord("hortografia");

        assertEquals("No himporta la hortografia", processor.text());
    }

    @Test
    void test_with_language() {

        ProcessorText procesador = new ProcessorText();

        procesador.newWord("Tengo");
        procesador.newWord("hambre");

        assertEquals("Tengo hambre", procesador.text());

        assertTrue(procesador.correct(Language.ES));
    }
}