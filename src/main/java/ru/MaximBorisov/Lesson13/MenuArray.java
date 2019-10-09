package ru.MaximBorisov.Lesson13;

public enum MenuArray {
    APPLE("яблоко"),

    PORRIDGE("каша"),

    CARROT("морковь"),

    PIE("пирог"),

    SOUP("суп"),

    PIZZA("пицца");
    private String nameDish;

    public String getNameDish() {
        return nameDish;
    }

    MenuArray(String nameDish) {
        this.nameDish = nameDish;
    }

    public static MenuArray findDishDyName(String name) {
        MenuArray result = null;
        for (MenuArray ar : MenuArray.values()) {
            if (name.equals(ar.getNameDish())) {
                result = ar;
                break;
            }
        }
        return result;
    }
}
