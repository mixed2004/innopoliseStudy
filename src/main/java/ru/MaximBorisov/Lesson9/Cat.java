package ru.MaximBorisov.Lesson9;

/**
 * это класс Cat.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class Cat extends Animal implements Run {
    /**
     * метод получения имени класса.
     *
     * @return имя класса
     */
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    /**
     * реализация метода run для Cat.
     */
    @Override
    public void run() {
        System.out.println(getName() + " я могу бегать");
    }
}
