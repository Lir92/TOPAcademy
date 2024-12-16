package Lesson8.Taks4;

public class Main {
    /*
    Задача: Магазин электроники

Создайте систему для работы с магазином электроники, в котором есть различные типы продуктов, каждый из которых может иметь дополнительные особенности.

1. Базовый класс Product:

Поля: name (название товара), price (цена товара).

Метод displayInfo() — выводит информацию о товаре.

Метод getDiscountPrice() — возвращает цену с учетом скидки (для базового товара скидка 0%).

2. Классы-наследники:

Smartphone:

Дополнительное поле: memorySize (объем памяти).

Метод displayInfo() — выводит информацию о смартфоне, включая его память.

Метод getDiscountPrice() — скидка 10% для смартфонов.

Laptop:

Дополнительное поле: processorType (тип процессора).

Метод displayInfo() — выводит информацию о ноутбуке, включая тип процессора.

Метод getDiscountPrice() — скидка 15% для ноутбуков.

SmartWatch:

Дополнительное поле: batteryLife (время работы от аккумулятора).

Метод displayInfo() — выводит информацию о смарт-часах, включая время работы от аккумулятора.

Метод getDiscountPrice() — скидка 5% для смарт-часов.

3. Класс Cart (Корзина покупок):

Список продуктов в корзине.

Добавляет товар в корзину.

Возвращает общую стоимость всех товаров в корзине с учетом скидок.

4. Создайте несколько товаров разных типов и добавьте их в корзину. Затем выведите информацию о каждом товаре и итоговую сумму за все товары в корзине.
     */

    public static void main(String[] args) {
        Product laptop = new Laptop("Lenovo", 10000, "Ryzen");
        Product smartphone = new Smartphone("Samsung", 5000, 128);
        Product smartWatch = new SmartWatch("Huawei", 2000, 256);

        Cart cart = new Cart();
        cart.addToCart(laptop);
        cart.addToCart(smartphone);
        cart.addToCart(smartWatch);

        System.out.println("Total sum to pay: " + cart.totalPrice());

    }
}
