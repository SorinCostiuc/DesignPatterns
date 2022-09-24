package structuralDesigns.decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = ChristmasTree.builder()
                .type("Artificial")
                .height(150)
                .weight(5)
                .build();
        tree.display();
        System.out.println();

        ChristmasTree decoratedTree = ChristmasTreeDecorator.builder()
                .tree(tree)
                .decorations(List.of("Lights", "Globes", "Candy"))
                .build();
        decoratedTree.display();

    }
}
