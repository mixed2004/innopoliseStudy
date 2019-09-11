package ru.MaximBorisov.Lesson3;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите зарпладу до вычета НДФЛ");
        int inputString = input.nextInt();
        double NDFL = 0.13;
        double salaryWhithNdfl = inputString * (1 - NDFL);
        System.out.printf("сумма %d после вычета НДФЛ составляет %f", inputString, salaryWhithNdfl);
    }
}
