package ru.MaximBorisov.Lesson8;
/**
        * это простейший калькулятор.
        *
        * @author Maxim Borisov (mail: mixed2004@mail.ru)
        * @version 1
        * @since 23.09.2019
        */
public class Calc {
    /**
     * обьявление переменной result.
     */
    public static double result;
    /**
     * Method add сложение.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void add(double first, double second) {
        result = first + second;
    }
    /**
     * Method subtract вычитание.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void subtract(double first, double second) {
        result = first - second;
    }
    /**
     * Method div деление.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void div(double first, double second) {
        result = first / second;
    }
    /**
     * Method multiple умножение.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void multiple(double first, double second) {
        result = first * second;
    }
}
