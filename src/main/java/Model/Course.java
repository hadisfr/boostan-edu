package main.java.Model;

import java.util.HashSet;

public class Course {
    private String name;
    private CourseId id;
    private Faculty faculty;
    private HashSet<Course> equivalents;
    private Grade.Type gradeType;
    private boolean effectLessOnGPA;

    public Course(String name, CourseId id, Faculty faculty, Grade.Type gradeType, boolean effectLessOnGPA) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        equivalents = new HashSet<Course>();
        this.gradeType = gradeType;
        this.effectLessOnGPA = effectLessOnGPA;
    }

    public void addEquivalent(Course equivalent) {
        equivalents.add(equivalent);
    }

    public String getName() {
        return name;
    }

    public Grade.Type getGradeType() {
        return gradeType;
    }

    public CourseId getId() {
        return id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public boolean isEquivalent(Course course) {
        return equivalents.contains(course);
    }
}
