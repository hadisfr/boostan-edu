package main.java.Model;

import java.util.ArrayList;
import java.util.Map;

public abstract class ProgramBox {
    private String name;
    private ArrayList<Course> courses;
    private Map<Course, ArrayList<PishniaziGroup>> pishniazis;

    public abstract Boolean eval();

    public ProgramBox(String name, ArrayList<Course> courses, Map<Course, ArrayList<PishniaziGroup>> pishniazis) {
        this.name = name;
        this.courses = courses;
        this.pishniazis = pishniazis;
    }
}
