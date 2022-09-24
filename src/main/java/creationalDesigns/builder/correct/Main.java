package creationalDesigns.builder.correct;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setPhoneNumber("07548")
                .setEmail("sorin@")
                .setName("Sorin")
                .setCnp("190")
                .build();
        System.out.println(student);
    }
}
