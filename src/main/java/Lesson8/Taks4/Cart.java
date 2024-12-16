package Lesson8.Taks4;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        cart.add(product);
    }

    public double totalPrice() {
        double price = 0;
        for(Product value: cart) {
            price = price + value.getDiscountPrice();
        }
        return price;
    }
}
