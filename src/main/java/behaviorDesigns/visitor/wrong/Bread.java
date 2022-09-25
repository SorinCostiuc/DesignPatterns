package behaviorDesigns.visitor.wrong;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bread implements Item {
    private int price;

    @Override
    public void buy(Wallet wallet) {
        if (wallet.getMoney() - price > 0) {
            wallet.setMoney(wallet.getMoney() - price);
        } else {
            System.out.println("Don't have enough money to buy bread");
        }
    }
}
