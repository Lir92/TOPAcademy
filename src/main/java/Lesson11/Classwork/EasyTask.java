package Lesson11.Classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EasyTask {
    /*
    Список чисел, представляющий очки игроков в игре. Необходимо удалить из списка все значения, меньше заданного порога
    и вывести оставшиеся очки в отсортированном порядке.
     */
    public static void main(String[] args) {

        Random random = new Random();
        int limit = 40;
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            points.add(random.nextInt(0, 100));
        }
        for(int i = 0; i < points.size();) {
            if(points.get(i) < limit) {
                points.remove(i);
            } else {
                i++;
            }
        }
        Collections.sort(points);
        System.out.println(points);
    }
}