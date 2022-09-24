package solid.openClosed.wrong;

public class Movie {
    private String movieType;

    public Movie(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void makeSound() {
        if ("comedy".equals(movieType)) {
            System.out.println("HAHAHAHA");
        } else if ("horror".equals(movieType)) {
            System.out.println("buhuhuhu");
        } else if ("action".equals(movieType)) {
            System.out.println("Pac pac");
        }else {
            System.out.println("I don't know");
        }
    }
}
