package main.java.Model;

public abstract class CourseEnrollmentState {
    protected boolean hasEffectOnGPA;
    protected boolean countedAsPassedUnit;

    public CourseEnrollmentState(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        this.hasEffectOnGPA = hasEffectOnGPA;
        this.countedAsPassedUnit = countedAsPassedUnit;
    }
}
