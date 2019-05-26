package main.java.Model;

import java.util.ArrayList;
import java.util.Map;

public class Program {
    private Map<Course, ArrayList<PishniaziGroup>> pishniazis;
    private NumericGrade passGrade;
    private Credit totalMaximumCredits;
    private Credit normalMaximumCredits;
    private Credit talentedMaximumCredits;
    private Credit mashrootMaximumCredits;
    private Credit normalMinimumCredits;
    private Credit talentedAverageLimit;
    private Credit mashrootAverageLimit;

    public Program(Map<Course, ArrayList<PishniaziGroup>> pishniazis, NumericGrade passGrade, Credit totalMaximumCredits,
                   Credit normalMaximumCredits, Credit talentedMaximumCredits, Credit mashrootMaximumCredits,
                   Credit normalMinimumCredits, Credit talentedAverageLimit, Credit mashrootAverageLimit) {
        this.pishniazis = pishniazis;
        this.passGrade = passGrade;
        this.totalMaximumCredits = totalMaximumCredits;
        this.normalMaximumCredits = normalMaximumCredits;
        this.talentedMaximumCredits = talentedMaximumCredits;
        this.mashrootMaximumCredits = mashrootMaximumCredits;
        this.normalMinimumCredits = normalMinimumCredits;
        this.talentedAverageLimit = talentedAverageLimit;
        this.mashrootAverageLimit = mashrootAverageLimit;
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

    public Credit getTotalMaximumCredits() {
        return totalMaximumCredits;
    }

    public Credit getNormalMaximumCredits() {
        return normalMaximumCredits;
    }

    public Credit getNormalMinimumCredits() {
        return normalMinimumCredits;
    }

    public Credit getTalentedMaximumCredits() {
        return talentedMaximumCredits;
    }

    public Credit getMashrootMaximumCredits() {
        return mashrootMaximumCredits;
    }

    //    TODO: use state pattern

    public Credit getTalentedAverageLimit() {
        return talentedAverageLimit;
    }

    public Credit getMashrootAverageLimit() {
        return mashrootAverageLimit;
    }
}
