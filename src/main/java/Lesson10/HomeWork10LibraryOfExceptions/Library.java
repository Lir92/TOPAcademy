package Lesson10.HomeWork10LibraryOfExceptions;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Library {
    private ArrayList<Book> bookLibrary = new ArrayList<>();

    public void addBook(Book book) {
        try {
            if(Objects.equals(book.getName(), "") || Objects.equals(book.getAuthor(), "") || book.getDateOfPublish() < 0) {
                throw new IllegalArgumentException();
            }
            bookLibrary.add(book);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }
    }

    public Book findBook(String name) {
        try {
            for(Book value: bookLibrary) {
                if(Objects.equals(value.getName().toLowerCase(Locale.ROOT), name.toLowerCase(Locale.ROOT))) {
                    return value;
                } else {
                    throw new BookNotFoundException(" нига " + name + " не найдена");
                }
            }
        } catch (BookNotFoundException bne) {
            bne.printStackTrace();
        }
        return null;
    }

    public void displayAllBooks() {
        for(Book value: bookLibrary) {
            System.out.println(value.toString());
        }
    }

}
