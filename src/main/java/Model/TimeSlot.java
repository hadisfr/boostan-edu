package main.java.Model;

import java.time.DayOfWeek;

public class TimeSlot {
    private DayOfWeek weekDay;
    private Time startTime;
    private Time endTime;

    public TimeSlot(DayOfWeek weekDay, Time startTime, Time endTime) {
        if (!startTime.isLessThan(endTime))
            throw new IllegalArgumentException();
        this.weekDay = weekDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public DayOfWeek getWeekDay() {
        return weekDay;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public boolean overlaps(TimeSlot timeSlot) {
        if (timeSlot.getWeekDay().equals(weekDay)) {
            if ((startTime.isLessThanEqual(timeSlot.getStartTime()) && timeSlot.getStartTime().isLessThan(endTime)) ||
                    (timeSlot.getStartTime().isLessThanEqual(startTime) && startTime.isLessThan(timeSlot.getEndTime())) ||
                    (startTime.equals(timeSlot.getStartTime()) && endTime.equals(timeSlot.getEndTime())))
                return true;
        }
        return false;
    }
}
