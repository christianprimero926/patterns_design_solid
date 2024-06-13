package course.udemy.exercises.solid.ocp;

import java.util.Comparator;

public class GeneratorPrimesInverseOrder extends GeneratorPrimesTeacher{
    @Override
    protected Comparator<Integer> getOrder() {
        return (a, b) -> a > b? -1: 1;
    }
}
