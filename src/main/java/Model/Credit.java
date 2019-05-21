package main.java.Model;

public abstract class Credit {
    protected float value;

    public Credit(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
