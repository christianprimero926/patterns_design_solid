package course.udemy.exercises.solid.ocp;

import java.util.List;

public class NaturalOrderStrategy implements PrimeOrderStrategy {
    @Override
    public List<Integer> order(List<Integer> primes) {
        return primes;
    }
}
