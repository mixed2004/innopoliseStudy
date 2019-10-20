package ru.MaximBorisov.Lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        try {
            File file = new File("library.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        Scanner in = new Scanner(System.in);
        List<Book> books = null;
        Library library = new Library();
        books = library.showLibrary();
        boolean run = true;
        while (run) {
            System.out.println("ваша библиотека:");
            library.print(books);
            System.out.println("хотите добавить книгу? (y/n/exit):");
            switch (in.nextLine()) {
                case "y":
                    if (books != null)
                        books.add(library.createBook());
                    else {
                        books = new ArrayList<>();
                        books.add(library.createBook());
                    }
                    break;
                case "n":
                    continue;
                case "exit":
                    run = false;
                    System.out.println("ваша библиотека:");
                    library.print(books);
                    break;
            }
            library.addBooks(books);
        }
    }

    public void print(List<Book> books) {
        if (books != null) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    public List<Book> showLibrary() {
        List<Book> listBook = null;
        InputStream is = null;
        try {
            is = new FileInputStream("library.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(is);
            listBook = (List<Book>) ois.readObject();
        } catch (IOException e) {
            System.out.println("библиотека пуста");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listBook;
    }

    public void addBooks(List<Book> book) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("library.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(book);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Book createBook() {
        String name, autor;
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Веедите автора");
        name = input.nextLine();
        System.out.println("Введите название");
        autor = input.nextLine();
        System.out.println("Введите год издания");
        year = input.nextInt();
        return new Book(name, autor, year);
    }
}