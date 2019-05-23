package main.java.Model;

public abstract class Grade {
    private boolean isReported;

    public Grade(boolean isReported) {
        this.isReported = isReported;
    }

    public boolean getReported() {
        return isReported;
    }
}
