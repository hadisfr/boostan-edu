package main.java.Model;

public class RequiredPassedCredit implements Pishniazi {

    private float credit;

    public RequiredPassedCredit(float credit) {
        this.credit = credit;
    }

    public boolean eval(Student student) {
        return student.getNumberOfPassedCredits() >= credit;
    }
}
