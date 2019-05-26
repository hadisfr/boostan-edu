package main.java.Model;

public class CourseExclusiveness implements Pishniazi {
    public boolean eval(Student student) {
        return student.getCurrentSartermCreditsNumber() == 0;
    }
}
