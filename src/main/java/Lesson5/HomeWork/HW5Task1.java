package Lesson5.HomeWork;

import java.util.Arrays;

public class HW5Task1 {
    public static void main(String[] args) {
        // Реализуй программу, которая меняет знак элемента массива array на противоположный,
        // если значение этого элемента чётное.

        int[] array = {101, 25, 867, 438, 90, 546, 13};
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                array[i] = array[i] * -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
