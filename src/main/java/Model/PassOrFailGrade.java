package main.java.Model;

public class PassOrFailGrade extends Grade {
    private boolean value;

    public PassOrFailGrade(boolean isReported, boolean value) {
        super(isReported);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
