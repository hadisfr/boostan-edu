package Model;

public class Course {
    private String name;
    private CourseId id;
    private Faculty faculty;

    public Course(String name, CourseId id, Faculty faculty) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
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
}
