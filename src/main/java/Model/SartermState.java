package main.java.Model;

import java.util.HashMap;

public abstract class SartermState {
    public void addCourse(CourseEnrollment courseEnrollment, HashMap<String, CourseEnrollment> courseEnrollments) {
        throw new IllegalStateException();
    }

    public void removeCourse(CourseEnrollment courseEnrollment, HashMap<String, CourseEnrollment> courseEnrollments) {
        throw new IllegalStateException();
    }
}
