package recap.Exercise.studentCourse;
import lombok.*;

import java.util.LinkedList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Builder

public class Course implements Subject {
    private String courseName;
    private String examData;
    private List<Observer> students;

    public Course() {
        students = new LinkedList<>();


    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", examData='" + examData + '\'' +
                '}';
    }

    @Override
    public String getDataExam() {
        return  this.examData;
    }


    @Override
    public void notifyStudents( ) {
        students.forEach(x -> x.changeDataExam(this.examData, this.courseName));

    }

    @Override
    public void signUp(Observer observer) {
        students.add(observer);


    }

    @Override
    public void changeDataExam(String latestExamDate) {
        this.examData = latestExamDate;
        notifyStudents();
    }

    @Override
    public void setLastExamDate(String lastExamDate) {
        this.examData = lastExamDate;
    }
}