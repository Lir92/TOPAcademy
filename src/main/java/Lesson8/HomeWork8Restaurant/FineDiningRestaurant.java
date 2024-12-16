package Lesson8.HomeWork8Restaurant;

public class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(String name) {
        super(name);
    }

    @Override
    public void serveFood() {
        System.out.println("We serve food in a luxuries manner");
    }
}
