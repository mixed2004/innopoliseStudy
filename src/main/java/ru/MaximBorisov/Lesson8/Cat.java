package ru.MaximBorisov.Lesson8;

/**
 * это класс Cat.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 23.09.2019
 */
public class Cat {
    /**
     * статическое поле количество объектов.
     */
    public static int catsNumber = 0;
    /**
     * поле имя.
     */
    public String name;
    /**
     * поле возраст.
     */
    public int age;

    /**
     * конструктор для сздания объекта кошки со счетчиком.
     *
     * @param name имя
     * @param age возраст
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        catsNumber++;
    }
}
