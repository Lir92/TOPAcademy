package Lesson10.HomeWork10LibraryOfExceptions;

public class Main {
    public static void main(String[] args) {
        // 1 ���� ������� ��������� �����. ���� ����� ��� ��� ����������� ��� ��� ������� ������������� - ������ ������.
        Book book1 = new Book("��� �� ���", "���������", 1885);
        Library myLib = new Library();
        myLib.addBook(book1);
        myLib.displayAllBooks();
    }
}
