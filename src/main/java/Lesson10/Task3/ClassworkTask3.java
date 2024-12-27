package Lesson10.Task3;

import java.util.ArrayList;
import java.util.Random;

public class ClassworkTask3 {

    public static void main(String[] args) {
        String[] id = new String[] {"25gld9", "fdl904", "4fkd6d", "qwe47r", null};
        ArrayList<String> fail = new ArrayList<>();
        ArrayList<String> pass = new ArrayList<>();

        for(int i = 0; i < id.length; i++) {
            try {
                processOrder(id[i]);
                pass.add(id[i]);
            } catch (IllegalArgumentException | OrderProcessingException e) {
                fail.add(id[i]);
            } finally {
                System.out.println("Обработка завершена для заказа " + id[i]);
            }
        }

        System.out.print("Невыполненные заказы: ");
        for(String value: fail) {
            System.out.print(value + ", ");
        }

        System.out.print("\nВыполненные заказы: ");
        for(String value: pass) {
            System.out.print(value + ", ");
        }
    }

    public static boolean processOrder(String orderId) throws IllegalArgumentException, OrderProcessingException {
        boolean isOk = true;
        Random random = new Random();
        try {
            Thread.sleep(2000);
            if(orderId == null) {
                isOk = false;
                throw new IllegalArgumentException();
            }
            Thread.sleep(2000);
            if(random.nextBoolean()) {
                isOk = false;
                throw new OrderProcessingException("Ошибка при обработке заказа: " + orderId);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return isOk;
    }
}
