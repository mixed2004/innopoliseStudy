package ru.MaximBorisov.Lesson4;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите число");
        int start = input.nextInt();
        System.out.println("введите шаг");
        int step = input.nextInt();
        System.out.println("введите количество чисел");
        int finish = input.nextInt();
        int a = start;
        int b = start;

        System.out.print("Геометрическая прогрессия: ");
        for (int i = 0; i < finish; i++) {
            System.out.print((b *= step) + " ");
        }
        System.out.print("\nАрифметическая прогрессия: ");
        for (int i = 0; i < finish; i++) {
            System.out.print((a += step) + " ");
        }
    }
}
