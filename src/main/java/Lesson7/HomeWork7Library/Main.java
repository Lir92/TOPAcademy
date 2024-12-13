package Lesson7.HomeWork7Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(902514, "Ромео и Джульетта", "Вильям Шекспир");
        Book book2 = new Book(102517, "Последний из Могикан", "Джеймс Фенимор Купер");
        Book book3 = new Book(897217, "Отцы и дети", "Иван Сергеевич Тургенев");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("===============");
        book1.displayInfo();
        System.out.println("================");
        System.out.println(library.findBook("Последний из Могикан"));
        library.removeBook(102517);

        library.displayAllBooks();

    }
}
