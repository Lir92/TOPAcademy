package Lesson4.HomeWork;

public class HWTask1 {
    // Напишите программу, которая находит первое четное число, большее 10.

    public static void main(String[] args) {
        int number = 0;
        while(true){
            if(number % 2 == 0 && number > 10) {
                System.out.println("Число " + number + " является чётным и больше 10");
                break;
            }
            number++;
        }
    }
}
