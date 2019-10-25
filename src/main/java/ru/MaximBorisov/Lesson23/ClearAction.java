package ru.MaximBorisov.Lesson23;

public class ClearAction implements UserAction {
    @Override
    public String name() {
        return "Очистка корзины";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        productBasket.clear();
        return true;
    }
}
