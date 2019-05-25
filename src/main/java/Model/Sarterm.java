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
        CourseOffering courseOffering = CourseOfferingRepository.get(offeringId);
        state.addCourse(
                new CourseEnrollment(courseOffering, getPassGrade(), courseOffering.getCourse().isEffectLessOnGPA()),
                enrollments
        );
    }

    public void removeCourse(String offeringId) {
        if (!enrollments.containsKey(offeringId))
            throw new IllegalArgumentException();
        state.removeCourse(enrollments.get(offeringId), enrollments);
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
}
