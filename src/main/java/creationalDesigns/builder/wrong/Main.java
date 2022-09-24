package creationalDesigns.builder.wrong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("19010", "Sorin", "sorin@gmail.com", "0758");

        Student student1 = new Student();
        student1.setCnp("190");
        student1.setName("Dumitru");
        student1.setPhoneNumber("0756");
    }
}
