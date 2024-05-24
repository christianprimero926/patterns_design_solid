package patterns.design.solid.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Referrer {
    public List<Movie> recommendations(Client client) {
        List<Movie> recommended = new ArrayList<>();
        for (Movie favorite : client.favorites()) {
            recommended.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.director()));
        }
        //recommended.removeAll(client.favorites());
        return recommended;
    }

    public String recommendationsCSV(Client client) {
        return recommendations(client).stream()
                .map(p -> (p.tittle() + "," + p.genre() + "," + p.director()))
                .collect(Collectors.joining("\n"));
    }
}
