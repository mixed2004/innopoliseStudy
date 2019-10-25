package ru.MaximBorisov.Lesson23;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удаление продукта";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        String name = input.askStr("Введите название продукта: ");
        productBasket.removeProduct(name);
        return true;
    }
}
