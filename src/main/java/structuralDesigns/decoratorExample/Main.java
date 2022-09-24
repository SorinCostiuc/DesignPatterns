package structuralDesigns.decoratorExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pasta pasta = Pasta.builder()
                .ingredients(List.of("Water", "Salt", "Olive oil"))
                .build();
        pasta.displayIngredients();
        Pasta carbonara = PastaDecorator.builder()
                .pasta(pasta)
                .ingredients(List.of("Egg", "Pancetta", "Parmegiano"))
                .build();
        carbonara.displayIngredients();
    }
}
