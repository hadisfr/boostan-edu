package main.java.Model;

public abstract class CourseEnrollmentState {
    protected boolean hasEffectOnGPA;
    protected boolean countedAsPassedUnit;

    public CourseEnrollmentState(boolean hasEffectOnGPA, boolean countedAsPassedUnit) {
        this.hasEffectOnGPA = hasEffectOnGPA;
        this.countedAsPassedUnit = countedAsPassedUnit;
    }

    public CourseEnrollmentState withdraw() {
        throw new IllegalStateException();
    }

    protected CourseEnrollmentState inferState(Grade grade, Grade passGrade, boolean noEffectOnGPA) {
        return grade.isLessThan(passGrade) ?
                (noEffectOnGPA ? new CourseFailednoEffectOnGPA() : new CourseFailed()) :
                (noEffectOnGPA ? new CoursePassednoEffectOnGPA() : new CoursePassed())
                ;
    }

    public CourseEnrollmentState setnoEffectOnGPA() {
        throw new IllegalStateException();
    }

    public CourseEnrollmentState setEffectiveOnGPA() {
        throw new IllegalStateException();
    }

    public CourseEnrollmentState finalizeGrade(Grade grade, Grade passGrade, boolean noEffectOnGPA) {
        throw new IllegalStateException();
    }

    public boolean isHasEffectOnGPA() {
        return hasEffectOnGPA;
    }

    public boolean isCountedAsPassedUnit() {
        return countedAsPassedUnit;
    }
}
