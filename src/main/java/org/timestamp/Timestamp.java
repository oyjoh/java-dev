package org.timestamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timestamp {

    private String formatter(LocalDateTime stamp) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return stamp.format(format);
    }

    // offset in seconds
    public String getTimestamp(int offset) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime offset_time;
        offset_time = now.plusSeconds(offset);
        return formatter(offset_time);


    }

    public String getTimestamp() {
        return formatter(LocalDateTime.now());
    }
}
