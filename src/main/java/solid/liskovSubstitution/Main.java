package solid.liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Movie movie = new ComedyMovie();
        movie = new HorrorMovie();//modify with another subclass
    }
}
