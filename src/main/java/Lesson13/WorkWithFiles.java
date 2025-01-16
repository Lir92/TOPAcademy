package Lesson13;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WorkWithFiles {
    public static void main(String[] args) {

        // �������� ����
        try {
            File file = new File("example.txt"); // �������� ����� � ��� ��������, ��� ��������� ������
            if(file.createNewFile()){ // �������� �� ������� ����� � ����� �� ������
                System.out.println("File create " + file.getAbsolutePath());
            } else {
                System.out.println("File already exist");
            }
//
            String text = "Hello, New Year";
            FileOutputStream fos = new FileOutputStream(file); // ��������� ���� c ������� ���������� ��� ���������
            // ����� �����, ��� �� ���������
            fos.write(text.getBytes()); // �������� ������ � ���� ���������
            text = "\nnew text";
            fos.write(text.getBytes());
            fos.close();

            FileReader reader = new FileReader(file); // ��������� �������� ������, ������� ������ ������ �� �����
            FileWriter writer = new FileWriter("result.txt", true); // ��������� ������� ������, ������� ������
            // ����� ���� ��� ������. true - ����, ������� ��������� ���������� � ���� �����, � �� �������������� ����.
            // ���� ���� ����, �� ������ ���� ���� ����� ����� wrire(), � �� append().

            while (reader.ready()) { // ���� � �������� ������� ���� ������ ��� ����������
                int data = reader.read(); // ��������� ���� � ����������
                writer.write(data); // � ���������� ��� ������ � ����� ����
            }
//            writer.append("\nSome string");
            reader.close();
            writer.close();
//
//            FileInputStream fis = new FileInputStream(file);
//            int content;
//            while ((content = fis.read()) != -1) {
//                System.out.print((char) content);
//            }
//
//            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
