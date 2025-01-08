package Lesson11.Classwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HardTask {
    //—ложна€
    //
    //–еализуйте систему управлени€ складами. ” вас есть карта (HashMap), где ключ Ч это название склада, а значение Ч список номеров €чеек (целые числа).
    //
    //1. ƒобавьте на каждый склад несколько новых €чеек.
    //
    //2. ”далите все €чейки, номера которых меньше заданного порога.
    //
    //3. ќпределите склад с максимальным количеством оставшихс€ €чеек.
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
