package main.java.Model;

public class NumericGrade extends Grade {
    private float value;

    public NumericGrade(float value) {
        super(Type.Numeric);
        if (value < 0 || value > 20)
            throw new IllegalArgumentException();
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return ((NumericGrade) obj).value == value;
    }

    @Override
    public boolean isLessThan(Grade numericGrade) {
        return value < ((NumericGrade) numericGrade).value;
    }

    public NumericGrade sum(NumericGrade grade){
        return new NumericGrade(value + grade.value);
    }
}
