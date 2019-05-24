package main.java.Model;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || minute < 0 || hour > 23 || minute > 59)
            throw new IllegalArgumentException();
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int toMinute() {
        return hour * 60 + minute;
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }

    @Override
    public boolean equals(Object obj) {
        return toMinute() == ((Time) obj).toMinute();
    }

    public boolean isLessThan(Time time) {
        return toMinute() < time.toMinute();
    }

    public boolean isLessThanEqual(Time time) {
        return isLessThan(time) || equals(time);
    }
}
