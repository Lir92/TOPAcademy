package Lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Lesson11Collections {
    /*
     использование списков:
     ArrayList - если нужно искать элементы по индексу, без частых удалений/добавлений.
     LinkedList - если есть необходимость часто удал€ть/добавл€ть.
     HashMap - быстрый доступ по ключу.
     Set - коллекци€, в которых наход€тс€ только уникальные значени€. ѕор€док элементов не совпадает с тем, как они
     добавл€ютс€


     */

    public static void main(String[] args) {
        Box<String> toyBox = new Box<>();
        toyBox.setItem("Ball");
        System.out.println(toyBox.getItem());

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 60);

        int price = map.get("Apple");
        boolean key = map.containsKey("Banana");
        map.remove("Cherry");
        System.out.println(key);
        System.out.println(map);
    }
}
