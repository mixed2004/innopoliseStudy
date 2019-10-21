package ru.MaximBorisov.Lesson18;

import java.io.File;
import java.io.IOException;

public class ReaderWriterMain {
    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            Writer writer = new Writer();
            File fileInput = new File("ReaderWriterInputTest.txt");
            File fileOutput = new File("ReaderWriterOutputTest.txt");
            if (!fileInput.exists()) {
                fileInput.createNewFile();
            }
            if (!fileOutput.exists()) {
                fileOutput.createNewFile();
            }
            if (fileInput.exists() && fileOutput.exists()) {
                String testString = "Тестовая строка, Testing string";
                System.out.println("Исходная тестовая строка: " + testString);
                writer.writeFile(testString, fileInput.getName(), "utf-8");
                String readingString = reader.readIFile(fileInput.getName(), "utf-8");
                System.out.println("Тестовая строка прочитанная с файла: " + readingString);
                writer.writeFile(readingString, fileOutput.getName(), "ansi-1251");
                readingString = reader.readIFile(fileOutput.getName(), "ansi-1251");
                System.out.println("Строка прочитанная с файла после перекодирования: " + readingString);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
