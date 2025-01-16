package HolidayTasks.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountWordsWithHashMap {

    //Средняя задача:
    //Создать программу для подсчёта частоты слов в тексте:
    //1. Пользователь вводит текст.
    //2. Вывести слова и их количество, используя HashMap.

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.println("Write some text and we will count the words:");

        // Simple words in simple text. If text is complex, it is not good.
        String[] strings = sc.nextLine().toLowerCase(Locale.ROOT).split("[!,? ._'@]+");
        System.out.println(Arrays.toString(strings));

        for(int i = 0; i < strings.length; i++) {
            if(map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], counter);
            }
        }

        System.out.println(map);
    }
}
