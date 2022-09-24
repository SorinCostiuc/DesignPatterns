package structuralDesigns.decoratorExample;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@Data
public class PastaDecorator extends Pasta{
    private Pasta pasta;
    private List<String> ingredients;

    @Override
    public void displayIngredients() {
        System.out.printf("Your carbonara pasta has %s and %s %n",
                pasta, ingredients);
    }
}
