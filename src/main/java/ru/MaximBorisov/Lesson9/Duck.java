package ru.MaximBorisov.Lesson9;

/**
 * это класс Duck.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class Duck extends Animal implements Run, Swim, Fly {
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
     * реализация метода fly для Duck.
     */
    @Override
    public void fly() {
        System.out.println(getName() + " я могу летать");
    }

    /**
     * реализация метода run для Duck.
     */
    @Override
    public void run() {
        System.out.println(getName() + " я могу бегать");
    }

    /**
     * реализация метода swim для Duck.
     */
    @Override
    public void swim() {
        System.out.println(getName() + " я могу плавать");
    }
}
