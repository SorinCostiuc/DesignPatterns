package solid.dependencyInversion.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Cat(),
                                       new Dog());
        HouseHold houseHold = new HouseHold();
        houseHold.setAnimals(animals);

        houseHold.getAnimals().forEach(Animal::makeSound);
    }
}
