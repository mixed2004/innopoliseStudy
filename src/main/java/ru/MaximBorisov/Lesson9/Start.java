package ru.MaximBorisov.Lesson9;

/**
 * это класс Start.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class Start {
    public static void main(String[] args) {
        new Cat().run();
        new Dog().run();
        new Dog().swim();
        new Duck().run();
        new Duck().swim();
        new Duck().fly();
        new OldMan().run();
        new OldMan().swim();
        new YoungMan().run();
        new YoungMan().swim();
    }
}
