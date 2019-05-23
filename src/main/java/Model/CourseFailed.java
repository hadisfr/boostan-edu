package main.java.Model;

public class CourseFailed extends CourseEnrollmentState {
    public CourseFailed(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        super(hasEffectOnGPA, countedAsPassedUnit);
    }
}
