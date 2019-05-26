package main.java.Model;

import java.util.HashMap;

public class Sarterm {
    private Semester semester;
    private Student student;
    private HashMap<String, CourseEnrollment> enrollments;
    private SartermState state;

    public Sarterm(Semester semester, Student student) {
        this.semester = semester;
        this.student = student;
        enrollments = new HashMap<String, CourseEnrollment>();
        state = new RegisteringSartermState();
    }

    public Sarterm(Semester semester, Student student, HashMap<String, CourseEnrollment> enrollments, SartermState state) {
        this(semester, student);
        this.enrollments = enrollments;
        this.state = state;
    }

    public void enrollCourse(String offeringId) {
        if (hasExclusive())
            throw new IllegalArgumentException("Can't have another course alongside an exclusive course");
        CourseOffering courseOffering = CourseOfferingRepository.get(offeringId);
        if (!student.checkPishniazi(courseOffering.getCourse()))
            throw new IllegalArgumentException("Pishniazi not satisfied");
        if (student.getTotalMaximumCredit().isLessThan(
                student.getNumberOfPassedCredits().sum(courseOffering.getCourse().getCredit())
        ))
            throw new IllegalArgumentException("Total max number of credits not satisfied.");
        if (student.getSemesterMaxCredit().isLessThan(
                this.getCurrentSartermNumberOfCredits().sum(courseOffering.getCourse().getCredit())
        ))
            throw new IllegalArgumentException("Semester max number of credits not satisfied.");

        state.addCourse(
                new CourseEnrollment(courseOffering, getPassGrade(), courseOffering.getCourse().isEffectLessOnGPA()),
                enrollments
        );
    }

    public void removeCourse(String offeringId) {
        if (!enrollments.containsKey(offeringId))
            throw new IllegalArgumentException();
        CourseEnrollment removedCourse = enrollments.get(offeringId);
        state.removeCourse(removedCourse, enrollments);
        if (!student.checkPishniazi(removedCourse.getCourseOffering().getCourse())) {
            enrollments.put(offeringId, removedCourse);
            throw new IllegalArgumentException("Hamniazi not satisfied after remove");
        }
    }

    public NumericGrade getPassGrade() {
        return student.getPassGrade();
    }

    public void enterInProgress() {
        state = new InProgressSartermState();
    }

    public void enterRegistering() {
        state = new RegisteringSartermState();
    }

    public void enterTerminated() {
        state = new TerminatedSartermState();
    }

    public void enterWithdrawing() {
        state = new WithdrawingSartermState();
    }

    private boolean hasExclusive() {
        for (CourseEnrollment courseEnrollment : enrollments.values()) {
            if (student.isExclusive(courseEnrollment.getCourseOffering().getCourse()))
                return true;
        }
        return false;
    }

    public Credit getCurrentSartermNumberOfCredits() {
        Credit result = new Credit(0);
        for (CourseEnrollment courseEnrollment : enrollments.values()) {
            result = result.sum(courseEnrollment.getCourseOffering().getCourse().getCredit());
        }
        return result;
    }

    public boolean finalCheck() {
        if (getCurrentSartermNumberOfCredits().isLessThan(student.getSemesterMinimumCredits()))
            return false;
        return true;
    }
}
