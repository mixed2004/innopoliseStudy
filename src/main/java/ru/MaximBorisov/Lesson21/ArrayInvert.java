package ru.MaximBorisov.Lesson21;

public class ArrayInvert {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayInvert.print(ar);
        ArrayInvert.invert(ar);
        ArrayInvert.print(ar);

    }

    public static int[] invert(int[] ar) {
        int arLength = ar.length;
        int temp;
        for (int i = 0; i < arLength / 2; i++) {
            temp = ar[i];
            ar[i] = ar[arLength - i - 1];
            ar[arLength - i - 1] = temp;
        }
        return ar;
    }

    public static void print(int[] ar) {
        int arLength = ar.length;
        for (int i = 0; i < arLength; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
