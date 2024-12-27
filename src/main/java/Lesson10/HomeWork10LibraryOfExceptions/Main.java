package Lesson10.HomeWork10LibraryOfExceptions;

public class Main {
    public static void main(String[] args) {
        // 1 надо создать экземпляр книги. Если автор или имя отсутствует или год выпуска отрицательный - кидаем ошибку.
        Book book1 = new Book("Отцы и дети", "Тургенев", 1885);
        Book book2 = new Book("Герой нашего времени", "Лермонтов", -1);
        Book book3 = new Book("", "Горький", 1800);
        Book book4 = new Book("Капитанская дочка", "Пушкин", 1880);
        Library myLib = new Library();
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);

        myLib.findBook("Горе от ума");
        System.out.println(myLib.findBook("отцы и дети"));

        myLib.displayAllBooks();
    }
}
