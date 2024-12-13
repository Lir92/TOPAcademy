package Lesson7.HomeWork7Library;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(int id) {
        for(int i = 0; i < bookList.size(); i ++) {
            if(bookList.get(i).getId() == id) {
                bookList.remove(i);
            }
        }
    }

    public Book findBook(String title) {
        for(Book value: bookList) {
            if(Objects.equals(value.getTitle(), title)) {
                return value;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for(Book value: bookList) {
            System.out.println(value.toString());
        }
    }
}
