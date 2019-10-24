package ru.MaximBorisov.Lesson21;

public class ArrayShift {
    public static void main(String[] args) {
        ArrayShift arrayShift = new ArrayShift();
        int[][] ar = {{1, 2, 3, 5, 6}, {3, 4, 5}, {6, 7, 8, 4}, {2, 3}, {1}};
        System.out.println("исходный массив:");
        arrayShift.print(ar);
        System.out.println("результирующий массив:");
        arrayShift.print(arrayShift.shift(ar));


    }

    public int[][] shift(int[][] ar) {
        int iLength = ar.length;
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < ar[i].length - 1; j++) {
                ar[i][j] = ar[i][j + 1];
            }
            ar[i][ar[i].length - 1] = 0;
        }
        return ar;
    }

    public void print(int[][] ar) {
        int iLength = ar.length;
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

}
