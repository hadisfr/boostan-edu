package main.java.Model;

public abstract class Grade {
    enum Type {Numeric, PassOrFail}

    protected Type type;

    public Grade(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public abstract boolean isLessThan(Grade grade);

    public boolean isLessThanEqual(Grade grade) {
        return equals(grade) || isLessThan(grade);
    }
}
