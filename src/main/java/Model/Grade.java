package main.java.Model;

public abstract class Grade {
    private boolean isReported;

    enum Type {Numeric, PassOrFail}

    protected Type type;

    public Grade(boolean isReported, Type type) {
        this.isReported = isReported;
        this.type = type;
    }

    public boolean getReported() {
        return isReported;
    }

    public Type getType() {
        return type;
    }

    public abstract boolean isLessThan(Grade grade);

    public boolean isLessThanEqual(Grade grade) {
        return equals(grade) || isLessThan(grade);
    }
}
