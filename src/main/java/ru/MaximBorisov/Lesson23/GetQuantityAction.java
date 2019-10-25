package ru.MaximBorisov.Lesson23;

public class GetQuantityAction implements UserAction {
    @Override
    public String name() {
        return "просмотреть количество по товару";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        String name = input.askStr("Введите название продукта: ");
        System.out.println(productBasket.getProductQuantity(name));
        return true;
    }
}
