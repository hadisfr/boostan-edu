package main.java.Model;

public abstract class Grade {
    private Boolean isReported;

    public Grade(Boolean isReported) {
        this.isReported = isReported;
    }

    public Boolean getReported() {
        return isReported;
    }
}
