package main.java.Model;

public class MajorYear {
    private int year;
    private Major major;

    public MajorYear(int year, Major major) {
        this.year = year;
        this.major = major;
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
}
