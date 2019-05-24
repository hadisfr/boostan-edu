package main.java.Model;

public class CourseFailed extends CourseEnrollmentState {
    public CourseFailed() {
        super(true, false);
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return this;
    }

    @Override
    public CourseEnrollmentState setEffectlessOnGPA() {
        return new CourseFailedEffectlessOnGPA();
    }
}
