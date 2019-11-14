package ru.MaximBorisov.Lesson30Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson30.FindFirstNonDubl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindFirstNonDublTest {
    @Test
    public void whenFindFirstCharThenFirstChar() throws Exception {
        FindFirstNonDubl findFirstNonDubl = new FindFirstNonDubl();
        String input = "total";
        char expected = 'o';
        assertThat(findFirstNonDubl.getFirstChar(input), is(expected));
    }

    @Test
    public void whenFindFirstCharThenFirstCharNonFirst() throws Exception {
        FindFirstNonDubl findFirstNonDubl = new FindFirstNonDubl();
        String input = "ttttt";
        char expected = 0;
        assertThat(findFirstNonDubl.getFirstChar(input), is(expected));
    }
}
