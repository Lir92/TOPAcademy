package Lesson10.HomeWork10LibraryOfExceptions;

public class Main {
    public static void main(String[] args) {
        // 1 ���� ������� ��������� �����. ���� ����� ��� ��� ����������� ��� ��� ������� ������������� - ������ ������.
        Book book1 = new Book("���� � ����", "��������", 1885);
        Book book2 = new Book("����� ������ �������", "���������", -1);
        Book book3 = new Book("", "�������", 1800);
        Book book4 = new Book("����������� �����", "������", 1880);
        Library myLib = new Library();
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);

        myLib.findBook("���� �� ���");
        System.out.println(myLib.findBook("���� � ����"));

        myLib.displayAllBooks();
    }
}
