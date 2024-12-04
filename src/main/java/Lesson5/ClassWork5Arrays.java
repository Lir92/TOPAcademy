package Lesson5;

import java.util.Arrays;

public class ClassWork5Arrays {
    public static void main(String[] args) {
        // урок посв€щЄнный массивам

        // варианты объ€влени€ массивов
        // 1 вариант:
//        int [] intArray = new int[5];
//        intArray[0] = 0;
//        intArray[1] = 1;
//        intArray[2] = 2;

        // 2 вариант:
//        int [] intArray = {0, 1, 2, 3, 4, 5};
//        System.out.println(intArray[2]);

//        for(int value: intArray) {
//            System.out.println(value);
//        }

//        String [] strArray = {"Java", "Kotlin", "C++"};
//        for (String value: strArray) {
//            if (value.equals("Kotlin")) {
////                System.out.println(value);
//                break;
//            }
//        }

        // объ€вление двумерного массива
        // вариант 1:
//        int[][] matrix = new int[3][3];

        // вариант 2:
//        int[][] matrix2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        for(int i = matrix2.length-1; i >= 0; i--) {
//            for(int j = matrix2.length-1; j >= 0; j--){
//                System.out.print(matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }

        //  Ћј—— ARRAYS =====================================================

//        int [] array = new int[5];
//        Arrays.fill(array, 3);
//        System.out.println(Arrays.toString(array));

        int [] array = {5, 76, 1, 312, 87, 132, 43};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
