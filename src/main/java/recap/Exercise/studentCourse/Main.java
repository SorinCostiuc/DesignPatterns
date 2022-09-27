package recap.Exercise.studentCourse;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Observer studentAlexandra = new Student();
        Observer studentStefan = new Student();
        Observer studentGeorgiana = new Student();

        Subject english= Course.builder()
                .courseName("English")
                .examData("25.09.2022")
                .students(new LinkedList<>())
                .build();

        Subject math= Course.builder()
                .courseName("Math")
                .examData("26.09.2022")
                .students(new LinkedList<>())
                .build();

        studentAlexandra.signUp(english);
        studentStefan.signUp(english);
        studentGeorgiana.signUp(english);
        studentGeorgiana.signUp(math);

        math.changeDataExam("28.09.2022");

        System.out.println(studentAlexandra);
        System.out.println(studentGeorgiana);
        System.out.println(studentStefan);
        math.changeDataExam("12.07.2033");
        System.out.println(studentGeorgiana);
    }
}