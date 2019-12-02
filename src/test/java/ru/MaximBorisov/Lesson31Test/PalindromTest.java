package ru.MaximBorisov.Lesson31Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson31.Palindrom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromTest {
    @Test
    public void whenPalindromThenTrue() {
        Palindrom palindrom = new Palindrom();
        String input = "Toot";
        assertTrue(palindrom.isPalindromStandart(input));
    }

    @Test
    public void whenNonPalindromThenFaulse() {
        Palindrom palindrom = new Palindrom();
        String input = "Tooto";
        assertFalse(palindrom.isPalindromStandart(input));
    }

    @Test
    public void whenPalindromThenTrueReplace() {
        Palindrom palindrom = new Palindrom();
        String input = "МаДАм";
        assertTrue(palindrom.isPalindromReplace(input));
    }

    @Test
    public void whenNonPalindromThenFaulseReplace() {
        Palindrom palindrom = new Palindrom();
        String input = "Tooto";
        assertFalse(palindrom.isPalindromReplace(input));
    }
    @Test
    public void whenPalindromThenTrueStack() {
        Palindrom palindrom = new Palindrom();
        String input = "МаДАм";
        assertTrue(palindrom.isPalindromStack(input));
    }

    @Test
    public void whenNonPalindromThenFaulseStack() {
        Palindrom palindrom = new Palindrom();
        String input = "Tooto";
        assertFalse(palindrom.isPalindromStack(input));
    }
}
