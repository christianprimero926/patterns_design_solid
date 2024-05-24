package patterns.design.solid.exercises.ocp;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class GeneratorPrimes {
    private final PrimeOrderStrategy orderStrategy;

    public List<Integer> primes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return orderStrategy.order(primes);

    }

    private boolean isPrime(int candidate) {
        for (int i = 2; i < candidate; i++) {
            if (candidate % i == 0) {
                return false;
            }
        }

        return true;
    }
}
