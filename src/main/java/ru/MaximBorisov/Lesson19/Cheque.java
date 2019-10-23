package ru.MaximBorisov.Lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cheque {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("products.txt"))) {
            double totalCost = 0;
            String string;
            double count, price;
            scanner.useDelimiter("\n");
            System.out.printf("%-20s%10s%10s%19s\n", "Наименование", "Кол-во", "Цена", "Стоимость");
            System.out.println("===========================================================");
            while (scanner.hasNext()) {
                string = scanner.next();
                count = scanner.nextDouble();
                price = scanner.nextDouble();
                totalCost += count * price;
                System.out.printf("%-20s%10.3f  x %10.2f%15.2f\n", string, count, price, count * price);

            }
            System.out.println("===========================================================");
            System.out.printf("%-49s%10.2f", "ИТОГО", totalCost);
        }
    }
}
