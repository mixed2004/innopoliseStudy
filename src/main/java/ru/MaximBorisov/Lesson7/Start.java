package ru.MaximBorisov.Lesson7;

import java.util.Scanner;

/**
 * класс Start.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 22.09.2019
 */
public class Start {
    /**
     * main.
     *
     * @param args args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**
         * количество внеенных денег.
         */
        int userMoney = 0;
        Scanner input = new Scanner(System.in);
        for (DrinksArray menu : DrinksArray.values()) {
            System.out.println(menu.toString());
        }
        System.out.print("введите сумму: ");
        try {
            userMoney = input.nextInt();
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong Input");
        }
        System.out.print("Выберите напиток ");
        int numberDrink = input.nextInt();
        switch (numberDrink) {
            case 1:
                if (userMoney >= DrinksArray.COCACOLA.getDrinkCost())
                    System.out.println("возьмите " + DrinksArray.COCACOLA.getDrinkName());
                else System.out.println("недостаточно средств");
                break;
            case 2:
                if (userMoney >= DrinksArray.TEA.getDrinkCost())
                    System.out.println("возьмите " + DrinksArray.TEA.getDrinkName());
                else System.out.println("недостаточно средств");
                break;
            case 3:
                if (userMoney >= DrinksArray.COFFE.getDrinkCost())
                    System.out.println("возьмите " + DrinksArray.COFFE.getDrinkName());
                else System.out.println("недостаточно средств");
                break;
            default:
                System.out.println("wrong input");
        }
    }
}