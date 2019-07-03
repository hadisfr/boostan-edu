package main.java.Model;

public class CoursePassed extends CourseEnrollmentState {
    public CoursePassed() {
        super(true, true);
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return this;
    }

    @Override
    public CourseEnrollmentState setnoEffectOnGPA() {
        return new CoursePassednoEffectOnGPA();
    }
}
