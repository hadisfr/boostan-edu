package main.java.Model;

public class CoursePassednoEffectOnGPA extends CourseEnrollmentState {
    public CoursePassednoEffectOnGPA() {
        super(false, true);
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return new CoursePassed();
    }

    @Override
    public CourseEnrollmentState setnoEffectOnGPA() {
        return this;
    }
}
