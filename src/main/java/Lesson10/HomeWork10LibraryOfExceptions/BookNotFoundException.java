package Lesson10.HomeWork10LibraryOfExceptions;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String message) {
        super(message);
    }
}
