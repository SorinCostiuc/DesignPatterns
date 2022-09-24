package solid.dependencyInversion.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new Cat(),
                                new Cat());
        HouseHold houseHold = new HouseHold();
        houseHold.setCats(cats);

        houseHold.getCats().forEach(Cat::makeSound);
    }
}
