package Lesson14;

import java.util.Objects;

public class Lesson14StringBuilderBuffer {
    /*
    StringBuilder - используется для работы со строкой - объединить несколько строк, добавить что-то к текущей строке.

     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Bye");
        sb.append(123);
        String result = sb.toString();
        System.out.println(result);

        sb.delete(5,8);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.replace(0,5, "Nihao");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int num = sb.indexOf("o");
        System.out.println(num);
    }
}
