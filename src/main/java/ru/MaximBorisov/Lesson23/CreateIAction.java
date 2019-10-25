package ru.MaximBorisov.Lesson23;

public class CreateIAction implements UserAction {
    @Override
    public String name() {
        return "Добавление продукта";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        String name = input.askStr("Введите название продукта: ");
        int quantity = input.askInt("введите количество: ");
        productBasket.addProduct(name, quantity);
        return true;
    }

}
