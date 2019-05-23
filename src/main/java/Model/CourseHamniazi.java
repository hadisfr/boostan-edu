package main.java.Model;

public class CourseHamniazi implements Pishniazi {
    Course course;

    public CourseHamniazi(Course course) {
        this.course = course;
    }

    @Override
    public boolean eval(Student student) {
        return student.hasTakenCourse(course);
    }
}
