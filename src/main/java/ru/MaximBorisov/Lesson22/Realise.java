package ru.MaximBorisov.Lesson22;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Realise {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 11));
        people.add(new Person("Tom", 20));
        people.add(new Person("Nick", 11));
        people.add(new Person("Alice", 34));
        people.add(new Person("Alice", 14));
        people.add(new Person("Alice", 20));
        people.add(new Person("Bill", 23));
        System.out.println("исходный список:");
        print(people);
        Collections.sort(people, new PersonSuperComparator());
        System.out.println("результирующий список:");
        print(people);
    }

    public static void print(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

}