package ru.MaximBorisov.Lesson3;

import java.util.Scanner;

public class GasolineCost {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество необходимого бензина");
        double amountOfGasoline = input.nextDouble();
        System.out.println("введите цену бензина");
        double costGasolineForLitr = input.nextDouble();
        System.out.printf("%f бензина по цене %f стоит: %f", amountOfGasoline, costGasolineForLitr, amountOfGasoline * costGasolineForLitr);
    }
}
