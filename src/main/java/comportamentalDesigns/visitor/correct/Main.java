package comportamentalDesigns.visitor.correct;


public class Main {
    public static void main(String[] args) {
        Item vegetable = new Vegetable(100);
        Item fruit = new Fruit(50);
        Item bread = new Bread(120);

        Wallet wallet = new Wallet(200);
        Cart bag = new Bag();
        vegetable.addToCart(bag);
        fruit.addToCart(bag);
        bread.addToCart(bag);

        System.out.println(bag.getTotalPrice());
        bag.buy(wallet);
    }
}
