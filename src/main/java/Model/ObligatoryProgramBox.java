package main.java.Model;

import java.util.ArrayList;
import java.util.Map;

public class ObligatoryProgramBox extends ProgramBox {
    public ObligatoryProgramBox(String name, ArrayList<Course> courses, Map<Course, ArrayList<PishniaziGroup>> pishniazis) {
        super(name, courses, pishniazis);
    }

    public Boolean eval() {
        return null;
    }
}
