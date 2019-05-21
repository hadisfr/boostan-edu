package main.java.Model;

public class CourseWithdrawn extends CourseEnrollmentState {
    public CourseWithdrawn(Boolean hasEffectOnGPA, Boolean countedAsPassedUnit) {
        super(hasEffectOnGPA, countedAsPassedUnit);
    }
}
