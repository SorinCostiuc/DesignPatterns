package creationalDesigns.singleton;

public class Main {
    public static void main(String[] args) {
//        EXAMPLE - is true cause it has same instance in heap memmory
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1==s2);
        System.out.println("-------------------" + "\n" + "-------------------");
        SingletonClass cass1 = SingletonClass.getInstance();
        cass1.setA(5);
        SingletonClass cass2 = SingletonClass.getInstance();
        System.out.println(cass1==cass2);
        System.out.println("----------");
        System.out.println(cass2.getA());

        //I want to use this database
        ConfigurationClass config = ConfigurationClass.getInstance();
        config.setUsername("Sorin");
        config.setDatabaseUrl("https://mydatabase:4433");

        config.getDataBaseUsername();
        config.getDataBaseUrl();

        DatabaseCaller caller = new DatabaseCaller();
        caller.doSomething();
        System.out.println("-------------------" + "\n" + "-------------------");
        System.out.println(CoffeShop.COFFE);

    }
}
