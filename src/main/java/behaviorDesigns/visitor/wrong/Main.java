package behaviorDesigns.visitor.wrong;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setMoney(200);

        Item vegetable = new Vegetable(65);
        Item fruit = new Fruit( 75);
        Item bread = new Bread(100);

        vegetable.buy(wallet);
        fruit.buy(wallet);
        bread.buy(wallet);

        System.out.println(wallet.getMoney());
    }
}
