package ru.MaximBorisov.Lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HoursInSeconds {
    public static void main(String[] args) {
        try {
            int inputString = Integer.parseInt(
                    Arrays.stream(args)
                            .map(Object::toString)
                            .collect(Collectors.joining())
            );
            int hours = inputString / 3600;
            int minutes = inputString % 3600 / 60;
            int seconds = inputString % 60;
            System.out.printf("в %d секунд содержится %d часов % d минут %d секунд", inputString, hours, minutes, seconds);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input");
        }
    }
}

