package solid.openClosed.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(new ComedyMovie(),
                                     new HorrorMovie());
        movies.forEach(Movie::makeSound);
    }
}
