package main.java.Model;

import java.util.HashMap;

public class RegisteringSartermState extends SartermState {
    @Override
    public void addCourse(CourseEnrollment courseEnrollment, HashMap<String, CourseEnrollment> courseEnrollments) {
        courseEnrollments.put(courseEnrollment.toString(), courseEnrollment);
    }

    @Override
    public void removeCourse(CourseEnrollment courseEnrollment, HashMap<String, CourseEnrollment> courseEnrollments) {
        courseEnrollments.remove(courseEnrollment.toString());
    }
}
