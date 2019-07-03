package main.java.Model;

import java.util.ArrayList;

public class Student extends Person {
    private StudentID sid;
    private MajorYear majorYear;
    private ArrayList<Sarterm> sarterms;

    public StudentID getSid() {
        return sid;
    }

    public Student(PersonName name, NationalID nid, StudentID sid, MajorYear majorYear) {
        super(name, nid);
        this.sid = sid;
        this.majorYear = majorYear;
        this.sarterms = new ArrayList<Sarterm>();
    }

    public NumericGrade getPassGrade() {
        return majorYear.getPassGrade();
    }

    public boolean hasTakenCourse(Course course) {
        return getCurrentSarterm().hasTakenCourse(course);
    }

    public boolean hasPassedCourse(Course course) {
        for (Sarterm sarterm : sarterms)
            if (sarterm.hasPassedCourse(course))
                return true;
        return false;
    }

    public Credit getNumberOfPassedCredits() {
        Credit result = new Credit(0, 0);
        for (Sarterm sarterm : sarterms)
            result = result.sum(sarterm.getNumberOfPassedCredits());
        return result;
    }

    public int getCurrentSartermEnrollmentNumbers() {
        return getCurrentSarterm().getNumberOfEnrollments();
    }

    public boolean checkPishniazi(Course course) {
        return this.majorYear.getProgram().canGetCourse(this, course);
    }

    public void openNewSarterm(Semester semester) {
        sarterms.add(new Sarterm(semester, this));
    }

    private Sarterm getCurrentSarterm() {
        if (sarterms.size() <= 0)
            throw new IllegalStateException("Empty sarterms");
        return sarterms.get(sarterms.size() - 1);
    }

    public void enrollCourse(String offeringId) {
        getCurrentSarterm().enrollCourse(offeringId);
    }

    public void removeCourse(String offeringId) {
        getCurrentSarterm().removeCourse(offeringId);
    }

    public void enterInProgress() {
        getCurrentSarterm().enterInProgress();
    }

    public void enterRegistering() {
        getCurrentSarterm().enterRegistering();
    }

    public void enterFinishd() {
        getCurrentSarterm().enterFinishd();
    }

    public void enterWithdrawing() {
        getCurrentSarterm().enterWithdrawing();
    }

    public boolean isExclusive(Course course) {
        return majorYear.getProgram().isExclusive(course);
    }

    public Credit getTotalMaximumCredit() {
        return majorYear.getProgram().getTotalMaximumCredits();
    }

    public Credit getSemesterMaxCredit() {
        if (isMashroot())
            return majorYear.getProgram().getMashrootMaximumCredits();
        if (isTalented())
            return majorYear.getProgram().getTalentedMaximumCredits();
        return majorYear.getProgram().getNormalMaximumCredits();
    }

    public Credit getSemesterMinimumCredits() {
        return majorYear.getProgram().getNormalMinimumCredits();
    }

    public void finalCheck() {
        if (!getCurrentSarterm().finalCheck())
            sarterms.remove(sarterms.size() - 1);
    }

    public NumericGrade getAverage() {
        Credit creditSum = new Credit(0, 0);
        NumericGrade gradeSum = new NumericGrade(0);
        for (Sarterm sarterm : sarterms) {
            creditSum = creditSum.sum(sarterm.getGPACredits());
            gradeSum = gradeSum.sum(sarterm.getGPAGrade());
        }
        return new NumericGrade(gradeSum.getValue() / creditSum.getValue());
    }

    private boolean isMashroot() {
        return getAverage().isLessThan(majorYear.getProgram().getMashrootAverageLimit());
    }

    private boolean isTalented() {
        return majorYear.getProgram().getTalentedAverageLimit().isLessThan(getAverage());
    }
}
