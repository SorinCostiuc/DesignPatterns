package creationalDesigns.factory;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale.getCountry());
        Pizza margherrita = new PizzaMargherita();
        margherrita.bake();
        System.out.println("----------");

        Pizza pizza = PizzaFactory.get(currentLocale.getCountry());
        pizza.bake();
        System.out.println("----------");
        Pizza pizza2 = PizzaFactory.get("RO");
        pizza2.bake();
        System.out.println("----------");
        Pizza pizza3 = PizzaFactory.get("IT");
        pizza3.bake();
    }
}
