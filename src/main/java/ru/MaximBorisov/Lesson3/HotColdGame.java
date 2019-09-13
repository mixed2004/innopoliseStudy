package ru.MaximBorisov.Lesson3;


import java.util.Scanner;

import static org.apache.commons.lang3.math.NumberUtils.isNumber;

public class HotColdGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int) (Math.random() * (101));
        System.out.println(x);
        int previous = 0;
        int next = 0;
        String end;
        System.out.println("я загадал число от 0 до 100 попробуй угадай для выхода набери exit");
        do {
            System.out.println("введите целое число от 0 до 100");
            String inputString = input.nextLine();
            if (!inputString.equals("exit") && isNumber(inputString)) {
                next = Integer.parseInt(inputString);
                if (Math.abs(x - previous) > Math.abs(x - next)) {
                    System.out.println("HOT");
                } else if (Math.abs(x - previous) < Math.abs(x - next)) {
                    System.out.println("COLD");
                } else {
                    System.out.println("SAME");
                }
                previous = next;
            } else {
                if (!inputString.equals("exit")) {
                    continue;
                } else {
                    break;
                }
            }
            if (next == x) {
                System.out.println("угадал");
            }
        } while (x != next);
    }
}
