package Lesson10.HomeWork10LibraryOfExceptions;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Library {
    private ArrayList<Book> bookLibrary = new ArrayList<>();

    public void addBook(Book book) {
        if(Objects.equals(book.getName(), "") || Objects.equals(book.getAuthor(), "") || book.getDateOfPublish() < 0) {
            throw new IllegalArgumentException();
        }
        bookLibrary.add(book);
    }

    public Book findBook(String name) throws BookNotFoundException {
        for(Book value: bookLibrary) {
            if(Objects.equals(value.getName().toLowerCase(Locale.ROOT), name.toLowerCase(Locale.ROOT))) {
                return value;
            } else {
                throw new BookNotFoundException(" нига " + name + " не найдена");
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
