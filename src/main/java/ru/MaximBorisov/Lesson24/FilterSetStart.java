package ru.MaximBorisov.Lesson24;

import java.util.*;

public class FilterSetStart {
    public static void main(String[] args) {
        FilterSet filterSet = new FilterSet();
        Set<String> set = new HashSet<>();
        List<String> list = Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        set.addAll(list);
        filterSet.removeEvenLength(set);

    }
}
