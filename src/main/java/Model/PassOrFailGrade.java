package main.java.Model;

public class PassOrFailGrade extends Grade {
    private boolean value;

    public PassOrFailGrade(boolean isReported, boolean value) {
        super(isReported, Type.PassOrFail);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return ((PassOrFailGrade) obj).value == value;
    }

    private int toInteger() {
        return value ? 1 : 0;
    }

    @Override
    public boolean isLessThan(Grade passOrFailGrade) {
        return toInteger() < ((PassOrFailGrade) passOrFailGrade).toInteger();
    }
}
