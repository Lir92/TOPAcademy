package Lesson10.HomeWork10LibraryOfExceptions;

public class Main {
    public static void main(String[] args) {
        // 1 надо создать экземпляр книги. Если автор или имя отсутствует или год выпуска отрицательный - кидаем ошибку.
        Book book1 = new Book("Дон ки Хот", "Сервантес", 1885);
        Library myLib = new Library();
        myLib.addBook(book1);
        myLib.displayAllBooks();
    }
}
