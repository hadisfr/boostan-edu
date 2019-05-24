package main.java.Model;

public class CourseEnrollment {
    private CourseEnrollmentState state;
    private Grade grade;

    public CourseEnrollment(Grade grade) {
        this.state = new CourseInProgress();
        this.grade = grade;
    }
}
