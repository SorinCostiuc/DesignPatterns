package creationalDesigns.factory;

public class PizzaFactory {
    public static Pizza get(final String country) {
//        switch (country){
//            case "RO":
//                return new PizzaDiavola();
//            case "US":
//                return new PizzaQuatroFormaggi();
//            default:
//                return new PizzaMargherita()
//        }
        return switch (country) {
            case "RO" -> new PizzaDiavola();
            case "US" -> new PizzaQuatroFormaggi();
            default -> new PizzaMargherita();

        };
    }
}

