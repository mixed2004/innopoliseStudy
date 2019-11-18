package ru.MaximBorisov.Lesson29Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson29.MapDublDelete;
import ru.MaximBorisov.Lesson29.People;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MapDublDeleteTest {
    @Test
    public void whenMapContainsDublicateThenMapWhithoutDubl() {
        MapDublDelete mapDublDelete = new MapDublDelete();
        Map<String, People> book = new LinkedHashMap<>();
        People person1 = new People(29, "Петрова", "жен");
        People person2 = new People(34, "Сидорова", "жен");
        People person3 = new People(34, "Тихонова", "жен");
        People person4 = new People(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        Map<String, People> expected = new LinkedHashMap<>();
        expected.put("Key1", person1);
        expected.put("Key3", person2);
        expected.put("Key4", person3);
        expected.put("Key5", person4);
        Map<String, People> result = new LinkedHashMap<>();
        result.putAll(mapDublDelete.removeTheDuplicates((HashMap<String, People>) book));
        assertThat(result, is(expected));
    }

    public static void main(String[] args) {
       ArrayList ar=new ArrayList();
       ar.add("Black");
       ar.add("Red");
       ar.add("Blue");
       ListIterator litr=ar.listIterator();
        System.out.println(litr.next()+" ");
        System.out.println(litr.next()+" ");
        System.out.println(litr.next());
    }
}
