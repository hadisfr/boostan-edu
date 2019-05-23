package main.java.Model;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class DateTime {
    private SimpleDateFormat date;
    private Duration duration;

    public DateTime(SimpleDateFormat date, Duration duration) {
        this.date = date;
        this.duration = duration;

    }
}
