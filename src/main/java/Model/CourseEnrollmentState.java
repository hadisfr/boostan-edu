package main.java.Model;

public abstract class CourseEnrollmentState {
    private boolean hasEffectOnGPA;
    private boolean countedAsPassedUnit;

    public CourseEnrollmentState(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        this.hasEffectOnGPA = hasEffectOnGPA;
        this.countedAsPassedUnit = countedAsPassedUnit;
    }
}
