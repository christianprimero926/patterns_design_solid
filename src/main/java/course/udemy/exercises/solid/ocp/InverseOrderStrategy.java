package course.udemy.exercises.solid.ocp;

import java.util.Collections;
import java.util.List;

public class InverseOrderStrategy implements PrimeOrderStrategy {
    @Override
    public List<Integer> order(List<Integer> primes) {
        Collections.reverse(primes);
        return primes;
    }
}
