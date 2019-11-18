package ru.MaximBorisov.Lesson33;

import java.util.*;

public class MaxChar {
    public List<Character> getMaxtChar(String s){
        Map<Character, Integer> mapChars = new HashMap<>();
        List<Character> result = new ArrayList<>();
        int maxChar = 0;
        char cr;
        for (int i = 0; i < s.length(); i++) {
            cr=s.charAt(i);
            if (mapChars.containsKey(cr)) {
                mapChars.replace(cr, mapChars.get(cr) + 1);
            } else {
                mapChars.put(cr, 1);
            }
            if(mapChars.get(cr)>maxChar){
                maxChar = mapChars.get(cr);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
            if (entry.getValue() == maxChar) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
