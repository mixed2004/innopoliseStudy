package ru.MaximBorisov.Lesson25;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IsUniqueMap {
    public boolean isUnique(Map<String, String> map) {
        List<String> list = new ArrayList<>();
        if (!map.isEmpty()) {
            list.addAll(map.values());
            int listLength = list.size();
            for (int i = 0; i < listLength - 1; i++)
                for (int j = i + 1; j < listLength - 1; j++) {
                    if (list.get(i).equals(list.get(j))) {
                        return false;
                    }
                }
        }
        return true;
    }
}

