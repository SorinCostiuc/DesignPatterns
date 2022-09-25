package creationalDesigns.singleton;

public class DatabaseCaller {
    public void doSomething(){
        ConfigurationClass config = ConfigurationClass.getInstance();

        System.out.println(config.getDataBaseUrl());
        System.out.println(config.getDataBaseUsername());
    }
}
