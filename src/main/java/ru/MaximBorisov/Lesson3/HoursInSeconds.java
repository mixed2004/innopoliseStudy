package ru.MaximBorisov.Lesson3;

import java.util.Scanner;

public class HoursInSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество секунд");
        int inputString = input.nextInt();
        int hours = inputString / 3600;
        int minutes = inputString % 3600 / 60;
        int seconds = inputString % 60;
        System.out.printf("в %d секунд содержится %d часов % d минут %d секунд", inputString, hours, minutes, seconds);
    }
}

