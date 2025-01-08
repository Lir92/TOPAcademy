package Lesson11.Classwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HardTask {
    //�������
    //
    //���������� ������� ���������� ��������. � ��� ���� ����� (HashMap), ��� ���� � ��� �������� ������, � �������� � ������ ������� ����� (����� �����).
    //
    //1. �������� �� ������ ����� ��������� ����� �����.
    //
    //2. ������� ��� ������, ������ ������� ������ ��������� ������.
    //
    //3. ���������� ����� � ������������ ����������� ���������� �����.
    public static void main(String[] args) {
        int limit = 30;
        HashMap<String, Integer> storehouse = new HashMap<>();
        storehouse.put("South store", 20);
        storehouse.put("West store", 15);
        storehouse.put("North store", 90);
        storehouse.put("East store", 34);

        Iterator<Map.Entry<String, Integer>> iterator = storehouse.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() < limit) {
                iterator.remove();
            }
        }

        System.out.println(storehouse);
    }
}
