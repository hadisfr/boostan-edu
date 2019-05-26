package main.java.Model;

import java.util.HashMap;

public class Student extends Person {
    private StudentID sid;
    private MajorYear majorYear;
    private HashMap<Semester, Sarterm> sarterms;
    private Sarterm currentSarterm;

    public StudentID getSid() {
        return sid;
    }

    public Student(PersonName name, NationalID nid, StudentID sid, MajorYear majorYear) {
        super(name, nid);
        this.sid = sid;
        this.majorYear = majorYear;
    }

    public NumericGrade getPassGrade() {
        return majorYear.getPassGrade();
    }

    public boolean hasTakenCourse(Course course) {
        return true;
    }

    public boolean hasPassedCourse(Course course) {
        return true;
    }

    public int getNumberOfPassedCredits() {
        return 0;
    }

    public int getCurrentSartermCreditsNumber() {
        return 0;
    }

    public boolean checkPishniazi(Course course) {
        return this.majorYear.getProgram().canGetCourse(this, course);
    }

    public void openNewSarterm(Semester semester) {
        if (sarterms.containsKey(semester))
            throw new IllegalArgumentException();
        Sarterm newSarterm = new Sarterm(semester, this);
        sarterms.put(semester, newSarterm);
        currentSarterm = newSarterm;
    }

    public void enrollCourse(String offeringId) {
        currentSarterm.enrollCourse(offeringId);
    }

    public void removeCourse(String offeringId) {
        currentSarterm.removeCourse(offeringId);
    }

    public void enterInProgress() {
        currentSarterm.enterInProgress();
    }

    public void enterRegistering() {
        currentSarterm.enterRegistering();
    }

    public void enterTerminated() {
        currentSarterm.enterTerminated();
    }

    public void enterWithdrawing() {
        currentSarterm.enterWithdrawing();
    }

    public boolean isExclusive(Course course) {
        return majorYear.getProgram().isExclusive(course);
    }
}
