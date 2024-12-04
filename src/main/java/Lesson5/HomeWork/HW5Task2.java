package Lesson5.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class HW5Task2 {

    // Напишите программу, которая задает длину массива и его элементы и находит и выводит минимальный элемент массива
    public static void main(String[] args) {
        int randSize = getRandomNumber();
        System.out.println("Array size: " + randSize);
        int [] array = new int[randSize];

        for(int i = 0; i < array.length; i++) {
            int tempNum = getRandomNumber();
            System.out.println("Put random number " + tempNum + " in array");
            array[i] = tempNum;
        }
        System.out.println("Let's see what we have in array: " + Arrays.toString(array));

        if(array.length == 1) {
            System.out.println("Minimal value in array - " + array[0]);
            return;
        }

        int minValue = array[0];
        for(int value: array) {
            if(minValue > value) {
                minValue = value;
            }
        }
        System.out.println("Minimal value in array - " + minValue);

    }

    public static int getRandomNumber () {
        Random random = new Random();
        return random.nextInt(1, 10);
    }
}
