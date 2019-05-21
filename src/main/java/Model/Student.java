package main.java.Model;

public class Student extends Person {
    private StudentID sid;
    private MajorYear majorYear;

    public StudentID getSid() {
        return sid;
    }

    public void setSid(StudentID sid) {
        this.sid = sid;
    }

    public Student(PersonName name, NationalID nid, StudentID sid, MajorYear majorYear) {
        super(name, nid);
        this.sid = sid;
        this.majorYear = majorYear;
    }

    public MajorYear getMajorYear() {
        return majorYear;
    }

    public void setMajorYear(MajorYear majorYear) {
        this.majorYear = majorYear;
    }
}
