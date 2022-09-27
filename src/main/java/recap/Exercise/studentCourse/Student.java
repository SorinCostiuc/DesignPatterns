package recap.Exercise.studentCourse;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor


public class Student implements Observer {
    private String name;
    private List<Subject> courses;


    @Override
    public void signUp(Subject observable) {
        observable.signUp(this);
        courses.add(observable);
    }

    public Student() {
        courses = new LinkedList<>();
    }

    @Override
    public void changeDataExam(String latestExamDate, String courseName) {
        for (int i=0; i<courses.size(); i++){
            if (courseName.equals(courses.get(i).getCourseName())){
                courses.get(i).setLastExamDate(latestExamDate);
//                courses.remove(courses.get(i));
//                courses.add(new Course())

            }
        }

    }


}