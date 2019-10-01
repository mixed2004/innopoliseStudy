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
        Start start = new Start();
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
        DrinksArray drink = null;
        drink = start.findDrinkById(numberDrink);
        if (drink != null) {
            if (userMoney >= drink.getDrinkCost()) {
                System.out.println("возьмите " + drink.getDrinkName());
            } else System.out.println("недостаточно средств");
        } else System.out.println("выбранного напитка не существует");

    }

    /**
     * метод поиска напитка по id.
     *
     * @param id
     * @return
     */
    public DrinksArray findDrinkById(int id) {
        DrinksArray result = null;
        for (DrinksArray ar : DrinksArray.values()) {
            if (id == ar.getIdDrink()) {
                result = ar;
                break;
            }
        }
        return result;
    }
}