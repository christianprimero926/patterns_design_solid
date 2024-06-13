package course.udemy.exercises.solid.srp;

import java.util.Arrays;
import java.util.List;

public record Client(String name, List<Movie> favorites) {
    public static Client of(String name, Movie... favorites) {
        return new Client(name, Arrays.asList(favorites));
    }

}
