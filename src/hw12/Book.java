package hw12;

import java.util.Objects;

public class Book {
    public Author author;
    public String bookName;
    public int publishingYear;

    public Book(Author author, String book, int year) {
        this.author = author;
        this.bookName = book;
        this.publishingYear = year;

    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public int setPublishingYear(int year) {
        return this.publishingYear = year;

    }

    @Override
    public String toString() {
        return "Автор книги: " + author + " Название книги: " + bookName + '\'' + " Год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublishingYear() == book.getPublishingYear() && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getBookName(), book.getBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getBookName(), getPublishingYear());
    }

    void printBook() {
        System.out.println("Автор: " + getAuthor() + " Название книги: " + getBookName() + " Изданна в: " + getPublishingYear());

    }
}


