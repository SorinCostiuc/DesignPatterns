package behaviorDesigns.visitor.correct;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bread implements Item {
    private int price;

    @Override
    public void addToCart(Cart cart) {
        cart.addItem(this);
    }

    @Override
    public Integer getPrice() {
        return price;
    }
}
