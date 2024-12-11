package Lesson6;

import java.util.Arrays;

public class ClassWork6Methods {
    public static void main(String[] args) {
//        printTime();
//        printTime("Hello world", 90);

//        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        printArraySum(ar);
//        fill(ar, 2, 11, 8);
//        System.out.println(Arrays.toString(ar));

        System.out.println(returnMin(2, 5));
        System.out.println(returnMax(2, 5));

    }

    // Невозвратные методы
    private static void print() {
        System.out.println("hello world");
    }

    public static void printTime() {
        for (int i = 0; i < 5; i++) {
            print();
        }
    }

    // параметризированные методы - методы, которые принимают какие-то параметры
    public static void printTime(String string, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print((i+1) + ") " + string + " ");
        }
    }

    public static void printArraySum(int[] data) {
        int sum = 0;
        for(int i = 0; i < data.length; i++){
            sum = sum + data[i];
        }
        System.out.println(sum);
    }

    public static void fill (int[] data, int from, int to, int value){
        if(from < 0 || to > data.length) {
            return;
        }

        for(int i = from; i < to ; i++) {
            data[i] = value;
        }

    }

    public static int returnMin (int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int returnMax (int a, int b) {
        return a > b ? a: b;
    }

}
