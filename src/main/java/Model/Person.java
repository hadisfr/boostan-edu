package main.java.Model;

public class Person {
    private PersonName name;
    private NationalID nid;

    public Person(PersonName name, NationalID nid) {
        this.name = name;
        this.nid = nid;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public NationalID getNid() {
        return nid;
    }

    public void setNid(NationalID nid) {
        this.nid = nid;
    }
}
