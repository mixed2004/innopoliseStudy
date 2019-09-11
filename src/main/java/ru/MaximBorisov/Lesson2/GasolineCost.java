package ru.MaximBorisov.Lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GasolineCost {
    public static void main(String args[]) {
        try {
            int amountOfGasoline = Integer.parseInt(
                    Arrays.stream(args)
                            .map(Object::toString)
                            .collect(Collectors.joining())
            );
            double costGasolineForLitr = 40;
            System.out.printf("%d бензина по цене %f стоит: %e" , amountOfGasoline , costGasolineForLitr , amountOfGasoline * costGasolineForLitr);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input");
        }
    }
}
