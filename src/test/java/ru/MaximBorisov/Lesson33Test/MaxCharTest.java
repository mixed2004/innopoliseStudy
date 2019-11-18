package ru.MaximBorisov.Lesson33Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson33.MaxChar;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxCharTest {
    @Test
    public void whenNeedMaxCharThenMaxChar(){
        MaxChar maxChar = new MaxChar();
        List<Character> expected = Arrays.asList('s');
        String input = "this is test message";
        assertThat(maxChar.getMaxtChar(input), is(expected));

    }
}
