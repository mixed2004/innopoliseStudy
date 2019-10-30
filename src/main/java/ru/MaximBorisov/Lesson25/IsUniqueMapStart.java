package ru.MaximBorisov.Lesson25;

import java.util.HashMap;
import java.util.Map;

public class IsUniqueMapStart {
    public static void main(String[] args) {
        IsUniqueMap isUniqueMap = new IsUniqueMap();
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Вася","Иванов");
        myMap.put("Петр","Петров");
        myMap.put("Виктор","Иванов");
        myMap.put("Сергей","Савельев");
        myMap.put("Вадим","Петров");
        Map<String, String> myMap1 = new HashMap<>();
        myMap1.put("Вася","Васов");
        myMap1.put("Петр","Петров");
        myMap1.put("Виктор","Викторов");
        myMap1.put("Сергей","Сергеев");
        myMap1.put("Вадим","Вадимов");
        Map<String, String> myMap2 = new HashMap<>();
        System.out.println(isUniqueMap.isUnique(myMap));
        System.out.println(isUniqueMap.isUnique(myMap1));
        System.out.println(isUniqueMap.isUnique(myMap2));

    }
}
