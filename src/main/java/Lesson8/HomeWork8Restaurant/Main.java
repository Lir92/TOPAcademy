package Lesson8.HomeWork8Restaurant;

import java.util.ArrayList;

public class Main {
    /*
    �������� ������� ����� Restaurant, � ��� ���������:FastFoodRestaurant � FineDiningRestaurant. ���������� ����� serveFood(),
    ������� ����� ��-������� �������� ��� ������� ���������.

*�������� ���� ������� ������� ����� �������� � ������� �������� ��������� � ����������� �� ��� ����

���������:instanceof(������������� ���������� ��� ���� ��� ������������ ������ ����� ������)
     */
    public static void main(String[] args) {
        Restaurant luxuryRest = new FineDiningRestaurant("Abrau-Durso Restaurant");
        Restaurant fastFood = new FastFoodRestaurant("KFC");

        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(luxuryRest);
        restaurants.add(fastFood);

        for(Restaurant value: restaurants) {
            if(value instanceof FineDiningRestaurant) {
                System.out.println("��� ��������� �������� "+ luxuryRest.name + ", ���� ����� ������� �������-������");
            } else if (value instanceof FastFoodRestaurant) {
                System.out.println(fastFood.name + " - ������� ����������, �� ��� �������.");
            }
        }


    }
}
