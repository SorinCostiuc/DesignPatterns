package behaviorDesigns.observer;

public class Main {
    public static void main(String[] args) {
        Observer sorin = new YoutubeUser();
        Observer stefan = new YoutubeUser();

        Observable venkatChannel = new YoutubeChannel();
        stefan.subscribe(venkatChannel);
        sorin.subscribe(venkatChannel);

        venkatChannel.changeState("Java Lambda Design Patterns");

//both receive
        System.out.println(sorin.getLastestState());
        System.out.println(stefan.getLastestState());
        System.out.println("----------");

        stefan.unsubscribe(venkatChannel);
        venkatChannel.changeState("Do not use Java");

        System.out.println(sorin.getLastestState());
        System.out.println(stefan.getLastestState());


    }
}
