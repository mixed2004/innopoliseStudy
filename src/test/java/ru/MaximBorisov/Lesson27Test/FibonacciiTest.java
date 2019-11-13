package ru.MaximBorisov.Lesson27Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson27.Fibonacci;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciiTest {
    @Test
    public void whenFibonacciSevenIterateThenSeven() {
        Fibonacci fibonacci = new Fibonacci();
        long[] expected = {0, 1, 1, 2, 3, 5, 8};
        long[] result = fibonacci.fibnacciIterate(7);
        assertThat(expected, is(result));
    }
    @Test
    public void whenFibonacciFiveRecursThenFive() {
        Fibonacci fibonacci = new Fibonacci();
        long[] expected = {0, 1, 1, 2, 3};
        long[] result = fibonacci.fibnacciRecurs(5);
        assertThat(expected, is(result));
    }
}
