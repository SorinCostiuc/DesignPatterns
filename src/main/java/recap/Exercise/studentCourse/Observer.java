package recap.Exercise.studentCourse;



public interface Observer {
    void signUp (Subject observable);
    void changeDataExam ( String latestExamDate, String courseName);

}