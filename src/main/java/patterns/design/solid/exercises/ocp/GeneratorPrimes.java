package patterns.design.solid.exercises.ocp;

import java.util.ArrayList;
import java.util.List;

public class GeneratorPrimes {
    public List<Integer> primes(int limit) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (esPrimo(i)) {
                primes.add(i);
            }
        }
        return primes;

    }

    private boolean esPrimo(int candidate) {
        for (int i = 2; i < candidate; i++) {
            if (candidate % i == 0) {
                return false;
            }
        }

        return true;
    }
}
