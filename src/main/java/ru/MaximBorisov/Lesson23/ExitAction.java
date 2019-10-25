package ru.MaximBorisov.Lesson23;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "EXIT";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        return false;
    }
}
