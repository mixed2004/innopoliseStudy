package ru.MaximBorisov.Lesson29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDublDelete {
    public Map<String, People> removeTheDuplicates(HashMap<String, People> map) {
        Map<String, People> mapDubl = new LinkedHashMap<>();
        for (Map.Entry<String, People> mapPeople : map.entrySet()) {
            if (mapDubl.containsValue(mapPeople.getValue())) {
                continue;
            } else {
                mapDubl.put(mapPeople.getKey(), mapPeople.getValue());
            }
        }
        return mapDubl;
    }
}
