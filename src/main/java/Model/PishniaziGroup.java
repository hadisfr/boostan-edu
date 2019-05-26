package main.java.Model;

import java.util.ArrayList;

public class PishniaziGroup {
    private ArrayList<Pishniazi> pishniazis;

    public PishniaziGroup(ArrayList<Pishniazi> pishniazis) {
        this.pishniazis = pishniazis;
    }

    public boolean eval(Student student) {
        for (Pishniazi pishniazi : pishniazis)
            if (!pishniazi.eval(student))
                return false;
        return true;
    }

    public boolean isExclusive() {
        for (Pishniazi pishniazi : pishniazis)
            if (pishniazi instanceof CourseExclusiveness)
                return true;
        return false;
    }
}
