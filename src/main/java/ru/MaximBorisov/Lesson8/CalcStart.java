package ru.MaximBorisov.Lesson8;

import java.io.IOException;
import java.util.Scanner;

public class CalcStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите первое число:");
        double firstNumber = input.nextDouble();
        System.out.println("введите второе число:");
        double secondNumber = input.nextDouble();
        System.out.println("введите знак:");
        String action = input.next();

        switch (action) {
            case "*":
                Calc.multiple(firstNumber, secondNumber);
                break;
            case "+":
                Calc.add(firstNumber, secondNumber);
                break;
            case "-":
                Calc.subtract(firstNumber, secondNumber);
                break;
            case "/":
                Calc.div(firstNumber, secondNumber);
                break;
            default:
                System.out.println("нет такого действия");

        }
        System.out.println(Calc.result);
    }
}
