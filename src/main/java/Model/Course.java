package main.java.Model;

import java.util.HashSet;

public class Course {
    private String name;
    private CourseId id;
    private Faculty faculty;
    private HashSet<Course> equivalents;
    private Grade.Type gradeType;

    public Course(String name, CourseId id, Faculty faculty, Grade.Type gradeType) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        equivalents = new HashSet<Course>();
        this.gradeType = gradeType;
    }

    public void addEquivalent(Course equivalent){
        equivalents.add(equivalent);
    }

    public String getName() {
        return name;
    }

    public CourseId getId() {
        return id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public boolean isEquivalent(Course course){
        return equivalents.contains(course);
    }
}
