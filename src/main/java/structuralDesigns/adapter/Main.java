package structuralDesigns.adapter;

public class Main {
    public static void main(String[] args) {
        UsaSocket socket = new UsaSocket();
        socket.chargeUsaPhone();
        System.out.println("----------");

        UsaSocket usaSocketAdapter = new ChargerAdapter(new RomanianCharger());
        usaSocketAdapter.chargeUsaPhone();



    }
}
