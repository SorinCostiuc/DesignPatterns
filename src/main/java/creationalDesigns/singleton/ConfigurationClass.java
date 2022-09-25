package creationalDesigns.singleton;

import lombok.Setter;

@Setter

//this is a singleton class
public class ConfigurationClass {
    private static ConfigurationClass instance;
    private String databaseUrl;
    private String username;

    public String getDataBaseUrl(){
        return databaseUrl;
    }
    public String getDataBaseUsername(){
        return username;
    }

    public static ConfigurationClass getInstance(){
        if (instance==null){
            instance = new ConfigurationClass();
        }
        return instance;
    }
}
