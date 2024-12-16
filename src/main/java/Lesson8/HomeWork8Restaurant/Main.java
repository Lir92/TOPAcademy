package Lesson8.HomeWork8Restaurant;

import java.util.ArrayList;

public class Main {
    /*
    —оздайте базовый класс Restaurant, и два подкласса:FastFoodRestaurant и FineDiningRestaurant. –еализуйте метод serveFood(),
    который будет по-разному работать дл€ каждого подкласса.

*проверки типа объекта который будет выводить в консоль название ресторана в зависимости от его типа

ѕодсказка:instanceof(дополнительно прочитайте про него или пересмотрите первую часть лекции)
     */
    public static void main(String[] args) {
        Restaurant luxuryRest = new FineDiningRestaurant("Abrau-Durso Restaurant");
        Restaurant fastFood = new FastFoodRestaurant("KFC");

        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(luxuryRest);
        restaurants.add(fastFood);

        for(Restaurant value: restaurants) {
            if(value instanceof FineDiningRestaurant) {
                System.out.println("Ёто приличный ресторан "+ luxuryRest.name + ", туда можно сводить бизнесс-парнЄра");
            } else if (value instanceof FastFoodRestaurant) {
                System.out.println(fastFood.name + " - обычна€ шаурмична€, но еда вкусна€.");
            }
        }


    }
}
