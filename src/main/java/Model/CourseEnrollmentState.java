package main.java.Model;

public abstract class CourseEnrollmentState {
    private Boolean hasEffectOnGPA;
    private Boolean countedAsPassedUnit;

    public CourseEnrollmentState(Boolean hasEffectOnGPA, Boolean countedAsPassedUnit) {
        this.hasEffectOnGPA = hasEffectOnGPA;
        this.countedAsPassedUnit = countedAsPassedUnit;
    }
}
