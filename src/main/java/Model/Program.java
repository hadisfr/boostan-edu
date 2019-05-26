package main.java.Model;

import java.util.ArrayList;
import java.util.Map;

public class Program {
    private Map<Course, ArrayList<PishniaziGroup>> pishniazis;
    private NumericGrade passGrade;

    public Program(Map<Course, ArrayList<PishniaziGroup>> pishniazis) {
        this.pishniazis = pishniazis;
    }

    public boolean canGetCourse(Student student, Course course) {
        if (!pishniazis.containsKey(course))
            return true;
        for (PishniaziGroup pishniaziGroup : pishniazis.get(course))
            if (pishniaziGroup.eval(student))
                return true;
        return false;
    }

    public NumericGrade getPassGrade() {
        return passGrade;
    }

    public boolean isExclusive(Course course) {
        if (pishniazis.containsKey(course))
            for (PishniaziGroup pishniaziGroup : pishniazis.get(course))
                if (pishniaziGroup.isExclusive())
                    return true;
        return false;
    }
}
