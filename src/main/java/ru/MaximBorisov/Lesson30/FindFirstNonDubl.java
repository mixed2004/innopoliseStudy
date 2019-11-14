package ru.MaximBorisov.Lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonDubl {
    public char getFirstChar(String s) throws Exception {
        Map<Character, Integer> mapChars = new LinkedHashMap<>();
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (mapChars.containsKey(s.charAt(i))) {
                mapChars.replace(s.charAt(i), mapChars.get(s.charAt(i)) + 1);
            } else {
                mapChars.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
