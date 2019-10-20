package ru.MaximBorisov.Lesson17;

import java.io.Serializable;

public class Book implements Serializable {
private static final long SerialVersionUID = 1L;
    private String name;
    private String autor;
    private int yearPublishing;

    public Book(String name, String autor, int yearPublishing) {
        this.name = name;
        this.autor = autor;
        this.yearPublishing = yearPublishing;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", yearPublishing=" + yearPublishing +
                '}';
    }
}
