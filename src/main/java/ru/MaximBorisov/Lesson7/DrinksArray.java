package ru.MaximBorisov.Lesson7;

/**
 * класс enum для списка напитков - DrinksArray.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 22.09.2019
 */
public enum DrinksArray {
    /**
     * кока-кола.
     */
    COCACOLA(1, "Кока-Кола", 100),
    /**
     * чай.
     */
    TEA(2, "Чай", 50),
    /**
     * кофе.
     */
    COFFE(3, "Кофе", 150);

    /**
     * уникальный номер напитка в списке.
     */
    private int idDrink;
    /**
     * наименование напитка.
     */
    private String drinkName;
    /**
     * стоимость напитка.
     */
    private int drinkCost;

    /**
     * конструктор для списка напитков.
     *
     * @param idDrink   уникальный номер напитка
     * @param drinkName название напитка
     * @param drinkCost стоимость напитка
     */
    DrinksArray(int idDrink, String drinkName, int drinkCost) {
        this.idDrink = idDrink;
        this.drinkName = drinkName;
        this.drinkCost = drinkCost;
    }

    /**
     * метод получения уникального номера напитка.
     *
     * @return уникальный номер
     */
    public int getIdDrink() {
        return idDrink;
    }

    /**
     * метод получения нименования напитка.
     *
     * @return наименование напитка
     */
    public String getDrinkName() {
        return drinkName;
    }

    /**
     * метод получения стоимости напитка.
     *
     * @return стоимость напитка.
     */
    public int getDrinkCost() {
        return drinkCost;
    }

    @Override
    public String toString() {
        return "Напиток " + idDrink +
                ", название: " + drinkName +
                ", стоимость=" + drinkCost;
    }

}