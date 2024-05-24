package patterns.design.solid.exercises.srp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BBDD {
    public static final String DIRECTOR_SPIELBERG = "Spielberg";
    private static final String GENRE_FANTASTIC = "fantastica";
    public static final Movie ET = new Movie("ET", GENRE_FANTASTIC, DIRECTOR_SPIELBERG);
    public static final Client JUAN = Client.of("Juan", ET);
    private static final String GENRE_BELIC = "belico";
    public static final Movie RYAN_SOLDIER = new Movie("Salvar al soldado Ryan", GENRE_BELIC, DIRECTOR_SPIELBERG);
    public static final Movie[] ALL = {ET, RYAN_SOLDIER};
    public static Map<String, List<Movie>> MOVIES_BY_DIRECTOR = Arrays.stream(ALL)
            .collect(Collectors.groupingBy(Movie::director));
}
