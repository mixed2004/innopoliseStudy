package ru.MaximBorisov.Lesson9;

/**
 * это класс Dog.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 26.09.2019
 */
public class Dog extends Animal implements Run, Swim {
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
     * реализация метода run для Dog.
     */
    @Override
    public void run() {
        System.out.println(getName() + " я могу бегать");
    }

    /**
     * реализация метода swim для Dog.
     */
    @Override
    public void swim() {
        System.out.println(getName() + " я могу плавать");
    }
}
