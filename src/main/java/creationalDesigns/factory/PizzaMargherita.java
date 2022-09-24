package creationalDesigns.factory;

public class PizzaMargherita implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Margherita. I don't like this pizza");
    }
}
