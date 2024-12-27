package Lesson10.HomeWork10LibraryOfExceptions;

public class Book {
    private String name;
    private String author;
    private int dateOfPublish;

    public Book(String name, String author, int dateOfPublish) {
        this.name = name;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfPublish() {
        return dateOfPublish;
    }

    @Override
    public String toString() {
        return "Книга: " +
                ", Название '" + name + '\'' +
                ", Автор " + author + ", Год издания " + dateOfPublish;
    }
}
