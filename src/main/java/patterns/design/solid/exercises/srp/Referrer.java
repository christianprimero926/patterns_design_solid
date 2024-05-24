package patterns.design.solid.exercises.srp;

import java.util.ArrayList;
import java.util.List;

public class Referrer {
    public List<Movie> recommendations(Client client) {
        List<Movie> recommended = new ArrayList<>();
        for (Movie favorite : client.favorites()) {
            recommended.addAll(LDB.MOVIES_BY_DIRECTOR.get(favorite.director()));
        }
        /*recommended = recommended.stream()
                .filter(movie -> !client.favorites().contains(movie))
                .distinct()
                .collect(Collectors.toList());*/
        recommended.removeAll(client.favorites());
        return recommended;
    }
}
