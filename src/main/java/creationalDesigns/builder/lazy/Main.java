package creationalDesigns.builder.lazy;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .phoneNumber("01245")
                .email("sorin@")
                .cnp("1234")
                .build();
        System.out.println(student);
    }
}
