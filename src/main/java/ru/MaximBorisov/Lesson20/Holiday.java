package ru.MaximBorisov.Lesson20;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Holiday {
    @JsonProperty(value = "holiday")
    private  boolean isHoliday;
    @JsonProperty(value = "date")
      private String date;

    @Override
    public String toString() {
        return "Holiday{" +
                "isHoliday=" + isHoliday +
                ", date='" + date + '\'' +
                '}';
    }
}
