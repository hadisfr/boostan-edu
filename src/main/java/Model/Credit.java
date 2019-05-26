package main.java.Model;

public class Credit {
    protected float value;

    public Credit(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public Credit sum(Credit credit) {
        return new Credit(value + credit.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        return value == ((Credit) obj).value;
    }

    public boolean isLessThan(Credit credit) {
        return value < credit.value;
    }

    public boolean isLessThanEqual(Credit credit) {
        return isLessThan(credit) || equals(credit);
    }
}
