package main.java.Model;

public class Instructor extends Person {
    private PersonalID pid;

    public Instructor(PersonName name, NationalID nid, PersonalID pid) {
        super(name, nid);
        this.pid = pid;
    }

    public PersonalID getPid() {
        return pid;
    }

    public void setPid(PersonalID pid) {
        this.pid = pid;
    }
}
