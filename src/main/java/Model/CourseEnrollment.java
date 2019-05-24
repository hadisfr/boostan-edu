package main.java.Model;

public class CourseEnrollment {
    private CourseEnrollmentState state;
    private Grade grade;
    private Grade passGrade;
    private CourseOffering courseOffering;
    private boolean effectlessOnGPA;

    CourseEnrollment(CourseOffering courseOffering, Grade passGrade, boolean effectlessOnGPA) {
        if (passGrade.getType() != courseOffering.getGradeType())
            throw new IllegalArgumentException();
        this.state = new CourseInProgress();
        this.passGrade = passGrade;
        this.courseOffering = courseOffering;
        this.effectlessOnGPA = effectlessOnGPA;
    }

    CourseEnrollment(Grade grade, CourseOffering courseOffering, Grade passGrade, boolean effectlessOnGPA,
                     CourseEnrollmentState state) {
        this(courseOffering, passGrade, effectlessOnGPA);
        setGrade(grade);
        this.state = state;
    }

    public void setGrade(Grade grade) {
        if (grade.getType() != this.grade.getType())
            throw new IllegalArgumentException();
        this.grade = grade;
        inferState();
    }

    private void inferState() {
        state = grade.isLessThan(passGrade) ?
                (effectlessOnGPA ? new CourseFailedEffectlessOnGPA() : new CourseFailed()) :
                (effectlessOnGPA ? new CoursePassedEffectlessOnGPA() : new CoursePassed())
        ;
    }

    Grade getGrade() {
        return grade;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void withdraw() {
        if (!(state instanceof CourseInProgress))
            throw new IllegalStateException();
        state = new CourseWithdrawn();
    }

    public void setEffectlessOnGPA(boolean effectlessOnGPA) {
        this.effectlessOnGPA = effectlessOnGPA;
        inferState();
    }
}
