package main.java.Model;

public class CourseEnrollment {
    private CourseEnrollmentState state;
    private Grade grade;
    private Grade passGrade;
    private CourseOffering courseOffering;

    CourseEnrollment(CourseOffering courseOffering, Grade passGrade) {
        if (passGrade.getType() != courseOffering.getGradeType())
            throw new IllegalArgumentException();
        this.state = new CourseInProgress();
        this.passGrade = passGrade;
        this.courseOffering = courseOffering;
    }

    CourseEnrollment(Grade grade, CourseOffering courseOffering, Grade passGrade) {
        this(courseOffering, passGrade);
        setGrade(grade);
    }

    public void setGrade(Grade grade) {
        if (grade.getType() != this.grade.getType())
            throw new IllegalArgumentException();
        this.grade = grade;
    }

    Grade getGrade() {
        return grade;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }
}
