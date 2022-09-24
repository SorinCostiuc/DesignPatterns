package structuralDesigns.decorator;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ChristmasTree {
    private Integer height;
    private Integer weight;
    private String type;

    public void display() {
        System.out.printf("I have a lovely christmas tree %s", this);
    }
}
