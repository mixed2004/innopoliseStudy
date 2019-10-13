package ru.MaximBorisov.Lesson7;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 * класс Start.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 22.09.2019
 */
public class Start {
    private static final Logger logger = Logger.getLogger(Start.class.getName());
    /**
     * main.
     *
     * @param args args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Handler fileHandler = new FileHandler("%h/vending.log");
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);

        /**
         * количество внеенных денег.
         */
        Start start = new Start();
        int userMoney = 0;
        Scanner input = new Scanner(System.in);
        for (DrinksArray menu : DrinksArray.values()) {
            System.out.println(menu.toString());
            logger.info("вывод меню");
        }
        System.out.print("введите сумму: ");
        try {
            userMoney = input.nextInt();
            logger.info("ввод средств на счет");
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong Input");
            logger.warning(nfe.toString());
        }
        System.out.print("Выберите напиток ");
        int numberDrink = input.nextInt();
        logger.info("выбор напитка");
        DrinksArray drink = null;
        drink = start.findDrinkById(numberDrink);
        if (drink != null) {
            if (userMoney >= drink.getDrinkCost()) {
                System.out.println("возьмите " + drink.getDrinkName());
                logger.info("получен " + drink.getDrinkName());
            } else{
                System.out.println("недостаточно средств");
                logger.warning("недостаточно средств");
            }
        } else {
            System.out.println("выбранного напитка не существует");
            logger.warning("выбранного напитка не существует");
        }

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