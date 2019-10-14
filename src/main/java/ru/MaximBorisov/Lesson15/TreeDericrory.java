package ru.MaximBorisov.Lesson15;

import java.io.File;
import java.util.Scanner;

public class TreeDericrory {

       static int counter = 0;;

    public static void main(String[] args) {
        System.out.println("Пвведите уть к папке");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Папки не существует");
        } else if (!file.isDirectory()) {
            System.out.println("Не является папкой");
        } else {
            printAllFilesFromDirectory(file);
        }
    }

    static void printAllFilesFromDirectory(File dirFileTrack) {

        for (File file : dirFileTrack.listFiles()) {
            print(file, counter);
            if (file.isDirectory()) {
                counter++;
                printAllFilesFromDirectory(file);
            }
        }
        counter--;
    }

    static void print(File file, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.print("   ");
        }
        System.out.println(file.getName());
    }
}
