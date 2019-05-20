import Model.Course;
import Model.Pishniazi;

public class CourseHamniazi extends Pishniazi {
    Course course;

    public CourseHamniazi(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
