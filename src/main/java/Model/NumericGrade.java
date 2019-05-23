package main.java.Model;

public class NumericGrade extends Grade {
    private float value;

    public NumericGrade(boolean isReported, float value) {
        super(isReported);
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
