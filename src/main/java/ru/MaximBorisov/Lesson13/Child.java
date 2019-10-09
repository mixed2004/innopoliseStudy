package ru.MaximBorisov.Lesson13;

import java.util.List;

public class Child {
    private List<MenuArray> loveList;

    public List<MenuArray> getLoveList() {
        return loveList;
    }

    public Child(List<MenuArray> loveList) {
        this.loveList = loveList;
    }

    void eat(MenuArray dish) throws MyExeption {
        if (getLoveList().contains(dish)) System.out.printf("Люблю %s", dish.getNameDish());
        else {
            throw new MyExeption("не люблю");
        }
    }
}
