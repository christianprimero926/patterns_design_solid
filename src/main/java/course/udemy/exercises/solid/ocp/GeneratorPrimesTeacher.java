package course.udemy.exercises.solid.ocp;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
public class GeneratorPrimesTeacher {

    public List<Integer> primes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        primes.sort(getOrder());
        return primes;

    }

    private boolean isPrime(int candidate) {
        for (int i = 2; i < candidate; i++) {
            if (candidate % i == 0) {
                return false;
            }
        }

        return true;
    }
    protected Comparator<Integer> getOrder(){
        return (a, b) -> a > b? 1: -1;
    }
}
