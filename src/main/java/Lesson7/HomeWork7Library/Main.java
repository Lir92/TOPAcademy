package Lesson7.HomeWork7Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(902514, "����� � ���������", "������ �������");
        Book book2 = new Book(102517, "��������� �� �������", "������ ������� �����");
        Book book3 = new Book(897217, "���� � ����", "���� ��������� ��������");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("===============");
        book1.displayInfo();
        System.out.println("================");
        System.out.println(library.findBook("��������� �� �������"));
        library.removeBook(102517);

        library.displayAllBooks();

    }
}
