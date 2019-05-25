package main.java.Model;

import java.util.regex.Pattern;

public class StudentID {
    private String id;

    public StudentID(String id) {
        if (Pattern.matches("[0-9]{4}[0-9]{2}[0-9]{3}", id))
            this.id = id;
        else
            throw new IllegalArgumentException();
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((StudentID) obj).getId();
    }
}
