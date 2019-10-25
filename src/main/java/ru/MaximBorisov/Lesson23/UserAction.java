package ru.MaximBorisov.Lesson23;

public interface UserAction {
    String name();

    boolean execute(Input input, ProductBasket productBasket);
}
