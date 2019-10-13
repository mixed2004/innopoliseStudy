package ru.MaximBorisov.Lesson15;

public class Recurs {
    public static void main(String[] args) {
       rec(5);
    }
    public static void rec( int n){
        System.out.println(n);
        while (n > 1) {
            rec(n-1 );
            break;
        }

    }
}
