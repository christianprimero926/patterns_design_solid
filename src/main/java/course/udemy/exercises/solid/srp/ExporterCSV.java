package course.udemy.exercises.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class ExporterCSV {
    public String exportMovies(List<Movie> movies) {
        return movies.stream()
                .map(p -> (p.tittle() + "," + p.director() + "," + p.genre()))
                .collect(Collectors.joining("\n"));
    }
}
