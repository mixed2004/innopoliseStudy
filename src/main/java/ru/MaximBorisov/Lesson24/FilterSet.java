package ru.MaximBorisov.Lesson24;

import java.util.HashSet;
import java.util.Set;

public class FilterSet {
    public Set<String> removeEvenLength(Set<String> set){
        Set<String> result = new HashSet<>();
        for (String i: set){
            if (!i.isEmpty()&&i.length()%2!=0){
                result.add(i);
                System.out.println(i);
            }
        }
        return result;
    }
}
