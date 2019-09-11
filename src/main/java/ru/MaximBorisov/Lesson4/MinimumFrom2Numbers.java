package ru.MaximBorisov.Lesson4;

import java.util.Scanner;

public class MinimumFrom2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите 1 число");
        int firstNumber = input.nextInt();
        System.out.println("введите 2 число");
        int secondNumber = input.nextInt();
        int min = Math.min(firstNumber, secondNumber);
        System.out.println("минимальное число " + min);
    }
}
