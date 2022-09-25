package comportamentalDesigns.observer;

public class Main {
    public static void main(String[] args) {
        Observer sorin = new YoutubeUser();
        Observer stefan = new YoutubeUser();

        Observable venkatChannel = new YoutubeChannel();
        stefan.subscribe(venkatChannel);
        sorin.subscribe(venkatChannel);

        venkatChannel.changeState("Java Lambda Desgin Patterns");


        System.out.println(sorin.getLastestState());


    }
}
