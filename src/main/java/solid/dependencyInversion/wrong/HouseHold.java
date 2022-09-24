package solid.dependencyInversion.wrong;

import java.util.List;

public class HouseHold {
    private List<Cat> cats;

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(final List<Cat> cats) {
        this.cats = cats;
    }
}
