package main.java.Model;

public class Credit {
    protected float practicalCredit;
    protected float theoreticalCredit;

    public Credit(float practicalCredit, float theoreticalCredit) {
        this.practicalCredit = practicalCredit;
        this.theoreticalCredit = theoreticalCredit;
    }

    public float getValue() {
        return this.practicalCredit + this.theoreticalCredit;
    }

    public float getPracticalCredit() {
        return practicalCredit;
    }

    public float getTheoreticalCredit() {
        return theoreticalCredit;
    }

    public Credit sum(Credit credit) {
        return new Credit(getPracticalCredit() + credit.getPracticalCredit(), getTheoreticalCredit() + credit.getTheoreticalCredit());
    }

    @Override
    public boolean equals(Object obj) {
        return getValue() == ((Credit) obj).getValue();
    }

    public boolean isLessThan(Credit credit) {
        return getValue() < credit.getValue();
    }

    public boolean isLessThanEqual(Credit credit) {
        return isLessThan(credit) || equals(credit);
    }
}
