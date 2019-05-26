package main.java.Model;

public class CourseExclusiveness implements Pishniazi {
    private Credit courseCredit;

    public CourseExclusiveness(Credit courseCredit) {
        this.courseCredit = courseCredit;
    }

    public boolean eval(Student student) {
        return student.getCurrentSartermCreditsNumber() == courseCredit.getValue();
    }
}
