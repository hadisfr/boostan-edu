package main.java.Model;

import java.util.regex.Pattern;

public class NationalID {
    private String id;

    public NationalID(String id) {
        if (Pattern.matches("[0-9]{10}", id))
            this.id = id;
        else
            throw new IllegalArgumentException();
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
