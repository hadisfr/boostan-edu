package main.java.Model;

public class Major {
    private String majorName;
    private Degree degree;

    public Major(String majorName, Degree degree) {
        this.majorName = majorName;
        this.degree = degree;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Degree getDegree() {
        return degree;
    }
}
