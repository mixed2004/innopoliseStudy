package ru.MaximBorisov.Lesson13;


import java.util.Arrays;
import java.util.Scanner;

import static ru.MaximBorisov.Lesson13.MenuArray.*;

public class Mother {
    public static void main(String[] args) {
        Child child = new Child(Arrays.asList(APPLE, PIZZA, PIE));
        Scanner input = new Scanner(System.in);
        System.out.print("Выберите чем накормить ребенка ");
        String name = input.nextLine();
        MenuArray dish = MenuArray.findDishDyName(name);
        if (dish != null) {
            try {
                child.eat(dish);
            } catch (MyExeption myExeption) {
                System.out.println(myExeption.getMessage());
            } finally {
                System.out.println("Спасибо, мама!");
            }
        } else {
            System.out.println("нет такого блюда");
        }
    }
}
