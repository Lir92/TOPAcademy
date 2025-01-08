package Lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Lesson11Collections {
    /*
     ������������� �������:
     ArrayList - ���� ����� ������ �������� �� �������, ��� ������ ��������/����������.
     LinkedList - ���� ���� ������������� ����� �������/���������.
     HashMap - ������� ������ �� �����.
     Set - ���������, � ������� ��������� ������ ���������� ��������. ������� ��������� �� ��������� � ���, ��� ���
     �����������


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
