package Lesson13;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WorkWithFiles {
    public static void main(String[] args) {

        // Создание фала
        try {
            File file = new File("example.txt"); // создание файла в том каталоге, где находится проект
            if(file.createNewFile()){ // проверка на наличие файла с таким же именем
                System.out.println("File create " + file.getAbsolutePath());
            } else {
                System.out.println("File already exist");
            }
//
            String text = "Hello, New Year";
            FileOutputStream fos = new FileOutputStream(file); // открываем файл c текущей директории или указываем
            // адрес файла, где он находится
            fos.write(text.getBytes()); // начинаем запись в файл побайтово
            text = "\nnew text";
            fos.write(text.getBytes());
            fos.close();

            FileReader reader = new FileReader(file); // запускаем читающий объект, который читает данные из файла
            FileWriter writer = new FileWriter("result.txt", true); // запускаем пишущий объект, который создаёт
            // новый файл для записи. true - флаг, который позволяет дописывать в файл текст, а не перезаписывать файл.
            // Если есть флаг, то писать файл надо через метод wrire(), а не append().

            while (reader.ready()) { // пока в читающем объекте есть данные для считывания
                int data = reader.read(); // сохраняем биты в переменную
                writer.write(data); // и записываем эти данные в новый файл
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
