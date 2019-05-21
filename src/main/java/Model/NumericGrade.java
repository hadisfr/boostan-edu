package main.java.Model;

public class NumericGrade extends Grade {
    private float value;

    public NumericGrade(Boolean isReported, float value) {
        super(isReported);
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
