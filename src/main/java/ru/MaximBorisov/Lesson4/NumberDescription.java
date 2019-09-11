package ru.MaximBorisov.Lesson4;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите число");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("Введен ноль");
        } else {
            if (number < 0) {
                System.out.print("отрицательное ");
            } else {
                System.out.print("положительное ");
            }
            if (number % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("не четное ");
            }
            System.out.println("число.");
        }
    }
}
