package HolidayTasks.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write down 10 sentences");
        int count = 0;

        while(count < 10) {
            list.add(sc.nextLine());
            count++;
        }

        Collections.reverse(list);

        System.out.println(list);
    }
}
