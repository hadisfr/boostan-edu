package main.java.Model;

public class MajorYear {
    private int year;
    private Major major;
    private Program program;

    public MajorYear(int year, Major major, Program program) {
        this.year = year;
        this.major = major;
        this.program = program;
    }

    public Major getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public NumericGrade getPassGrade() {
        return program.getPassGrade();
    }
}
