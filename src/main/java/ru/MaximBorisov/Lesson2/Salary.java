package ru.MaximBorisov.Lesson2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Salary {
    public static void main(String[] args) {
        try {
            int inputString = Integer.parseInt(
                    Arrays.stream(args)
                            .map(Object::toString)
                            .collect(Collectors.joining())
            );
            double NDFL = 0.13;
            double salaryWhithNdfl = inputString * (1 - NDFL);
            System.out.printf("сумма %d после вычета НДФЛ составляет %f" , inputString , salaryWhithNdfl);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input");
        }
    }
}
