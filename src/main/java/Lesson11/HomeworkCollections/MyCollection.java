package Lesson11.HomeworkCollections;

import javax.print.DocFlavor;
import java.util.*;

public class MyCollection {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(random.nextInt(0, 100));
        myArrayList.add(random.nextInt(0, 100));
        myArrayList.add(random.nextInt(0, 100));

        System.out.println(myArrayList);

        System.out.println("===================================================================");

        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Who let the dogs out?");
        myLinkedList.add("Who!?");
        myLinkedList.add("Who!?");
        myLinkedList.add("Who!?");

        myLinkedList.removeFirst();
        myLinkedList.removeLast();

        System.out.println(myLinkedList);

        System.out.println("===================================================================");

        HashMap<String, Integer> myHasMap = new HashMap<>();
        myHasMap.put("Kirill", random.nextInt(0, 80));
        myHasMap.put("Jack", random.nextInt(0, 80));
        myHasMap.put("Tatyana", random.nextInt(0, 80));
        myHasMap.put("Sandy", random.nextInt(0, 80));

        System.out.println(myHasMap);

        System.out.println("===================================================================");

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("We add some string");
        myHashSet.add("Now we add another string");
        myHashSet.add("and one more string");
        myHashSet.add("We add some string");

        System.out.println(myHashSet);
    }
}
