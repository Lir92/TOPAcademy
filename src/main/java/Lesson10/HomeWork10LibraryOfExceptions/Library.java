package Lesson10.HomeWork10LibraryOfExceptions;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Book> bookLibrary = new ArrayList<>();

    public void addBook(Book book) {
        bookLibrary.add(book);
    }

    public Book findBook(String name) {
        for(Book value: bookLibrary) {
            if(Objects.equals(value.getName(), name)) {
                return value;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for(Book value: bookLibrary) {
            System.out.println(value.toString());
        }
    }

}
