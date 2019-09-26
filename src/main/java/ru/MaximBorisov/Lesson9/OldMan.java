package ru.MaximBorisov.Lesson9;

/**
 * это класс OldMan.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class OldMan extends People {
    /**
     * реализация метода run для OldMan.
     */
    @Override
    public void run() {
        System.out.println("я старый человек и медленно бегаю");
    }

    /**
     * реализация метода swim для OldMan.
     */
    @Override
    public void swim() {
        System.out.println("я старый человек и плохо плаваю");
    }
}
