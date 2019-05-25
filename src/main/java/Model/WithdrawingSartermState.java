package main.java.Model;

import java.util.HashMap;

public class WithdrawingSartermState extends SartermState {
    @Override
    public void removeCourse(CourseEnrollment courseEnrollment, HashMap<String, CourseEnrollment> courseEnrollments) {
        courseEnrollments.get(courseEnrollment.toString()).withdraw();
    }
}
