package main.java.Model;

public class NumericGrade extends Grade {
    private float value;

    public NumericGrade(boolean isReported, float value) {
        super(isReported);
        if (value < 0 || value > 20)
            throw new IllegalArgumentException();
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
