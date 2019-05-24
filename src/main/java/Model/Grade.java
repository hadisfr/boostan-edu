package main.java.Model;

public abstract class Grade {
    private boolean isReported;
    enum Type {Numeric, PassOrFail}
    protected Type type;

    public Grade(boolean isReported, Type type) {
        this.isReported = isReported;
    }

    public boolean getReported() {
        return isReported;
    }

    public Type getType() {
        return type;
    }
}
