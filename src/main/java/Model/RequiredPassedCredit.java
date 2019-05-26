package main.java.Model;

public class RequiredPassedCredit implements Pishniazi {

    private Credit credit;

    public RequiredPassedCredit(Credit credit) {
        this.credit = credit;
    }

    public boolean eval(Student student) {
        return (!credit.isLessThan(student.getNumberOfPassedCredits()));
    }
}
