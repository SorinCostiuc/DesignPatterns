package creationalDesigns.factory;

public class PizzaDiavola implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Diavola. Auch...hot, hot hot");
    }
}
