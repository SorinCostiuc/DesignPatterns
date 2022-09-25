package behaviorDesigns.visitor.correct;

public interface Item {
    void addToCart(Cart cart);
    Integer getPrice();
}
