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

    protected CourseEnrollmentState inferState(Grade grade, Grade passGrade, boolean effectlessOnGPA) {
        return grade.isLessThan(passGrade) ?
                (effectlessOnGPA ? new CourseFailedEffectlessOnGPA() : new CourseFailed()) :
                (effectlessOnGPA ? new CoursePassedEffectlessOnGPA() : new CoursePassed())
                ;
    }

    public CourseEnrollmentState setEffectlessOnGPA(){
        throw new IllegalStateException();
    }

    public CourseEnrollmentState setEffectiveOnGPA(){
        throw new IllegalStateException();
    }

    public CourseEnrollmentState finalizeGrade(Grade grade, Grade passGrade, boolean effectlessOnGPA){
        throw new IllegalStateException();
    }
}
