package patterns.design.solid.exercises.ocp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GeneratorPrimesTest {
    @Test
    void test_order_natural() {

        GeneratorPrimes generator = new GeneratorPrimes();
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13);

        assertThat(generator.primes(15), is(expected));
    }

    @Test
    void test_order_inverse() {

        GeneratorPrimes generator = new GeneratorPrimes();
        List<Integer> expected = Arrays.asList(13, 11, 7, 5, 3, 2);

        assertThat(generator.primes(15), is(expected));
    }
}