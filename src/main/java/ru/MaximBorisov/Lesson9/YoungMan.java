package ru.MaximBorisov.Lesson9;

/**
 * это класс YoungMan.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class YoungMan extends People {
    /**
     * реализация метода run для YoungMan.
     */
    @Override
    public void run() {
        System.out.println("я молодой человек и быстро бегаю");
    }

    /**
     * реализация метода swim для YoungMan.
     */
    @Override
    public void swim() {
        System.out.println("я молодой человек и хорошо плаваю");
    }
}
