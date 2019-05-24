package main.java.Model;

public class CourseFailedEffectlessOnGPA extends CourseEnrollmentState {
    public CourseFailedEffectlessOnGPA() {
        super(false, false);
    }

    @Override
    public CourseEnrollmentState setEffectlessOnGPA() {
        return this;
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return new CourseFailed();
    }
}
