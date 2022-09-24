package creationalDesigns.factory;

public class PizzaQuatroFormaggi implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Cheese pizza. It sticks but it's a nais");
    }
}
