package main.java.Model;

public class CoursePassedEffectlessOnGPA extends CourseEnrollmentState {
    public CoursePassedEffectlessOnGPA() {
        super(false, true);
    }

    @Override
    public CourseEnrollmentState setEffectiveOnGPA() {
        return new CoursePassed();
    }

    @Override
    public CourseEnrollmentState setEffectlessOnGPA() {
        return this;
    }
}
