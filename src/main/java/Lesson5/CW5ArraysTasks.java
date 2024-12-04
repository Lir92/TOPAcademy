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
//            System.out.println("������� " + (i + 1) + "� �����");
//            array[i] = scanner.nextInt();
//            sum += array[i];
//        }
//        System.out.println(sum);

        // ============== TASK 2 =====================
        /*���������, ������� ������ ������������ ������ ���������� ��������� � ������.
        * ����� ��������� ����������� ���������� ������ � ������� �������� � �������:
        * �������, ������������ � ����������� �����. ���� ������ ������ ������ 50, ������
        * ���������� "������� �� ���� �������"*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������� � ������?");
        int numberOfStudents = scanner.nextInt();
        int[] studentsMarks = new int[numberOfStudents];
        int averageValue = 0;

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("������� ������ � " + (i+1) + " �������?");
            studentsMarks[i] = scanner.nextInt();
            averageValue += studentsMarks[i];
            if (studentsMarks[i] < 50) {
                System.out.println((i+1) + " ������ �� ���� �������");
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
        System.out.println("����������� ���� " + studentsMarks[0]);
        System.out.println("������������ ���� " + studentsMarks[numberOfStudents-1]);
        System.out.println("������� ���� " + averageValue / numberOfStudents);

        scanner.close();
    }
}
