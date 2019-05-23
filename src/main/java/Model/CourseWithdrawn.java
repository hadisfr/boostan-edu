package main.java.Model;

public class CourseWithdrawn extends CourseEnrollmentState {
    public CourseWithdrawn(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        super(hasEffectOnGPA, countedAsPassedUnit);
    }
}
