package structuralDesigns.decoratorExample;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;


@Data
@SuperBuilder
@NoArgsConstructor
public class Pasta {
    private List<String> ingredients;

    public void displayIngredients(){
        System.out.println(ingredients);
    }
}
