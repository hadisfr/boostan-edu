package main.java.Model;

import java.util.ArrayList;
import java.util.Map;

public class SelectiveProgramBox extends ProgramBox {
    public SelectiveProgramBox(String name, ArrayList<Course> courses, Map<Course, ArrayList<PishniaziGroup>> pishniazis) {
        super(name, courses, pishniazis);
    }

    public Boolean eval() {
        return null;
    }
}
