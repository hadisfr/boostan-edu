package main.java.Model;

public class CoursePishniazi implements Pishniazi {
    private Course course;

    public CoursePishniazi(Course course) {
        this.course = course;
    }

    public boolean eval(Student student) {
        return student.hasPassedCourse(course);
    }
}
