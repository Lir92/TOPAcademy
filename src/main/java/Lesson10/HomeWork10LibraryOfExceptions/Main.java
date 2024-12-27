package Lesson10.HomeWork10LibraryOfExceptions;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("���� � ����", "��������", 1885);
        Book book2 = new Book("����������� �����", "������", 1880);
        Book book3 = new Book("����� ������ �������", "���������", -1);
        Book book4 = new Book("", "�������", 1800);
        Library myLib = new Library();

        try {
            myLib.addBook(book1);
            myLib.addBook(book2);
            myLib.addBook(book3);
            myLib.addBook(book4);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }

        try {
            System.out.println(myLib.findBook("���� �� ���"));
            System.out.println(myLib.findBook("���� � ����"));
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

        myLib.displayAllBooks();
    }
}
