package main.java.Model;

public class Student extends Person {
    private StudentID sid;

    public StudentID getSid() {
        return sid;
    }

    public void setSid(StudentID sid) {
        this.sid = sid;
    }

    public Student(PersonName name, NationalID nid, StudentID sid) {
        super(name, nid);
        this.sid = sid;
    }
}
