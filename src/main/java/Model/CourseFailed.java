package main.java.Model;

public class CourseFailed extends CourseEnrollmentState {
    public CourseFailed(Boolean hasEffectOnGPA, Boolean countedAsPassedUnit) {
        super(hasEffectOnGPA, countedAsPassedUnit);
    }
}
