package main.java.Model;

import java.util.HashMap;

public class Sarterm {
    private Semester semester;
    private Student student;
    private HashMap<String, CourseEnrollment> enrollments;

    public Sarterm(Semester semester, Student student) {
        this.semester = semester;
        this.student = student;
        enrollments = new HashMap<String, CourseEnrollment>();
    }

    public Sarterm(Semester semester, Student student, HashMap<String, CourseEnrollment> enrollments) {
        this(semester, student);
        this.enrollments = enrollments;
    }

    public void enroll(String courseId) {
        try {
            CourseOffering courseOffering = CourseOfferingRepository.get(courseId);
            CourseEnrollment courseEnrollment = new CourseEnrollment(courseOffering, getPassGrade(),
                    courseOffering.getCourse().isEffectLessOnGPA());
            enrollments.put(courseId, courseEnrollment);
        } catch (IllegalArgumentException ignored) {
        }
    }

    public NumericGrade getPassGrade() {
        return student.getPassGrade();
    }
}
