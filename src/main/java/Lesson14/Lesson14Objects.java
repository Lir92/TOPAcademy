package Lesson14;

import java.util.HashSet;

public class Lesson14Objects {
    public static void main(String[] args) {
        Person p1 = new Person("Dasha", 17);
        Person p2 = new Person("Dasha", 17);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        System.out.println(personHashSet.size());
    }
}
