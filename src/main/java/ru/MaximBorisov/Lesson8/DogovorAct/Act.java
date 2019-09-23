package ru.MaximBorisov.Lesson8.DogovorAct;

public class Act {

    private int number;
    private String date;
    private String[] goods;

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getGoods() {
        return goods;
    }

    public Act(int number, String date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
    }
}
