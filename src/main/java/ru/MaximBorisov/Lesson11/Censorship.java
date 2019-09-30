package ru.MaximBorisov.Lesson11;

import java.util.regex.Pattern;

public class Censorship {
    public String censorship(String input) {
        return Pattern.compile("(?i)бяка", Pattern.UNICODE_CASE).matcher(input).replaceAll("*заменено цензурой*");
    }
}
