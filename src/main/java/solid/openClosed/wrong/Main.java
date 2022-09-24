package solid.openClosed.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(new Movie("comedy"),
                                    new Movie("horror"),
                                    new Movie("action"),
                                    new Movie("romantic"));

        movies.forEach(Movie::makeSound);
    }
}
