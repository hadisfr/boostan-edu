package main.java.Model;

public class CourseInProgress extends CourseEnrollmentState {
    public CourseInProgress() {
        super(false, false);
    }

    @Override
    public CourseEnrollmentState withdraw() {
        return new CourseWithdrawn();
    }

    @Override
    public CourseEnrollmentState finalizeGrade(Grade grade, Grade passGrade, boolean noEffectOnGPA) {
        return inferState(grade, passGrade, noEffectOnGPA);
    }
}
