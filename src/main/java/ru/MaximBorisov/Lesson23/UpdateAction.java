package ru.MaximBorisov.Lesson23;

public class UpdateAction implements UserAction {
    @Override
    public String name() {
        return "изменение количества продукта";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        String name = input.askStr("Введите название продукта: ");
        int quantity = input.askInt("введите новое количество: ");
        productBasket.updateProductQuantity(name, quantity);
        return true;
    }
}
