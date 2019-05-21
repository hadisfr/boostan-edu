package main.java.Model;

public class PassOrFailGrade extends Grade {
    private Boolean value;

    public PassOrFailGrade(Boolean isReported, Boolean value) {
        super(isReported);
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }
}
