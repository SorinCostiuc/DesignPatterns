package recap.Exercise.studentCourse;

public interface Subject {

    String getDataExam();
    void notifyStudents( );
    void signUp (Observer observer);

    void changeDataExam ( String latestExamDate);

    String getCourseName();

    void setLastExamDate(String lastExamDate);

}