package main.java.Model;

public class CoursePassed extends CourseEnrollmentState {
    public CoursePassed(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        super(true, true);
    }
}
