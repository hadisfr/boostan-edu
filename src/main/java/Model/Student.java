package main.java.Model;

public class Student extends Person {
    private StudentID sid;
    private MajorYear majorYear;

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
}
