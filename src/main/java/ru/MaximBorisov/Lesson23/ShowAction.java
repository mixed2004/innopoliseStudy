package ru.MaximBorisov.Lesson23;

import java.util.List;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Просмотреть корину";
    }

    @Override
    public boolean execute(Input input, ProductBasket productBasket) {
        List<String> list= productBasket.getProducts();
        for (String str:list){
            System.out.println(str);
        }
        return true;
    }
}
