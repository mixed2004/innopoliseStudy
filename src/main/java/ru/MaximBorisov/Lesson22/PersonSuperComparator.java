package ru.MaximBorisov.Lesson22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        int result = a.getName().compareTo(b.getName());
        if(result==0){
            result = a.getAge()-b.getAge();
        }
        return result;
    }
}