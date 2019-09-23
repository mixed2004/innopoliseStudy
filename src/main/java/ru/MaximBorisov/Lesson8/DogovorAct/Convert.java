package ru.MaximBorisov.Lesson8.DogovorAct;

public class Convert {
    public static Act convert(Dogovor dogovor){
        return new Act(dogovor.getNumber(), dogovor.getDate(), dogovor.getGoods());
    }
}
