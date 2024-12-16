package Lesson8.HomeWork8Restaurant;

public class FastFoodRestaurant extends Restaurant{

    public FastFoodRestaurant(String name) {
        super(name);
    }

    @Override
    public void serveFood() {
        System.out.println("We serve food tidily but fast");
    }
}
