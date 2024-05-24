package patterns.design.solid.exercises.srp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReferrerTest {

    @Test
    public void test() {
        Referrer r = new Referrer();

        List<Movie> recommendations = r.recommendations(BBDD.JUAN);

        assertFalse(recommendations.contains(BBDD.ET));
    }

    @Test
    public void test_format() {
        Referrer r = new Referrer();

        String csv = new ExporterCSV().exportMovies(r.recommendations(BBDD.JUAN));

        String expected = "Salvar al soldado Ryan,Spielberg,belico";

        assertEquals(expected, csv);

    }
}