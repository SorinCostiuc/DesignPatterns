package solid.dependencyInversion.correct;

import java.util.List;

public class HouseHold {
    private List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
