package main.java.Model;

public class CourseFailednoEffectOnGPA extends CourseEnrollmentState {
    public CourseFailednoEffectOnGPA() {
        super(false, false);
    }

    @Override
    public CourseEnrollmentState setnoEffectOnGPA() {
        return this;
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return new CourseFailed();
    }
}
