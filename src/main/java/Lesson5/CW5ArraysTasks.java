package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class CW5ArraysTasks {
    public static void main(String[] args) {

        // ============= TASK 1 ================
//        int [] array = new int[5];
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Введите " + (i + 1) + "е число");
//            array[i] = scanner.nextInt();
//            sum += array[i];
//        }
//        System.out.println(sum);

        // ============== TASK 2 =====================
        /*программа, которая просит пользователя ввести количество студентов в классе.
        * Затем программа запрашивает количество баллов у каждого студента и выводит:
        * средний, максимальный и минимальный баллы. Если ученик набрал меньше 50, должно
        * выводиться "студент не сдал экзамен"*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько учеников в классе?");
        int numberOfStudents = scanner.nextInt();
        int[] studentsMarks = new int[numberOfStudents];
        int averageValue = 0;

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Сколько баллов у " + (i+1) + " ученика?");
            studentsMarks[i] = scanner.nextInt();
            averageValue += studentsMarks[i];
            if (studentsMarks[i] < 50) {
                System.out.println((i+1) + " ученик не сдал экзамен");
            }
        }

        for(int i = 0; i < numberOfStudents - 1; i++) {
            for(int j = 0; j < numberOfStudents - i -1; j++) {
                if(studentsMarks[j + 1] < studentsMarks[j]) {
                    int temp = studentsMarks[j];
                    studentsMarks[j] = studentsMarks[j + 1];
                    studentsMarks[j + 1] = temp;
                }
            }
        }

//        System.out.println(Arrays.toString(studentsMarks));
        System.out.println("Минимальный балл " + studentsMarks[0]);
        System.out.println("Максимальный балл " + studentsMarks[numberOfStudents-1]);
        System.out.println("Средний балл " + averageValue / numberOfStudents);

        scanner.close();
    }
}
