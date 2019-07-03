package main.java.Model;

public class CourseEnrollment {
    private CourseEnrollmentState state;
    private Grade grade;
    private Grade passGrade;
    private CourseOffering courseOffering;
    private boolean noEffectOnGPA;  // should be used only to infer next state

    CourseEnrollment(CourseOffering courseOffering, Grade passGrade, boolean noEffectOnGPA) {
        if (passGrade.getType() != courseOffering.getGradeType())
            throw new IllegalArgumentException();
        this.state = new CourseInProgress();
        this.passGrade = passGrade;
        this.courseOffering = courseOffering;
        this.noEffectOnGPA = noEffectOnGPA;
    }

    CourseEnrollment(Grade grade, CourseOffering courseOffering, Grade passGrade, boolean noEffectOnGPA,
                     CourseEnrollmentState state) {
        this(courseOffering, passGrade, noEffectOnGPA);
        setGrade(grade);
        this.state = state;
    }

    public void setGrade(Grade grade) {
        if (grade.getType() != this.grade.getType())
            throw new IllegalArgumentException();
        if (!(state instanceof CourseInProgress))
            throw new IllegalStateException();
        this.grade = grade;
    }

    public void finalizeGrade() { //TODO: use outside
        state.finalizeGrade(this.grade, this.passGrade, this.noEffectOnGPA);
    }

    Grade getGrade() {
        return grade;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void withdraw() {
        state = state.withdraw();
    }

    public void setnoEffectOnGPA() {
        state = state.setnoEffectOnGPA();
        this.noEffectOnGPA = true;
    }

    public void setEffectiveOnGPA() {
        state = state.setEffectiveOnGPA();
        this.noEffectOnGPA = false;
    }

    public boolean isEffectiveOnGPA() {
        return state.isHasEffectOnGPA();
    }

    public boolean isCountedAsPassedUnit() {
        return state.isCountedAsPassedUnit();
    }

    public boolean isTakenOrPassed() {
        return !(state instanceof CourseWithdrawn);
    }

    public boolean isPassed() {
        return (state instanceof CoursePassed) || (state instanceof CoursePassednoEffectOnGPA);
    }
}
