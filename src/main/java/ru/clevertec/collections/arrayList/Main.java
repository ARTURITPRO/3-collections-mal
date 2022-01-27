package ru.clevertec.collections.arrayList;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("1. add:");
        List<String> str = new SimpleArray<>();
        for (int a = 0; a < 11; a++) {
            str.add(" " + a + " ");
        }

        for (String a : str) {
            System.out.println("   str.add(" + i + "): [" + i + "]= " + a);
            i++;
            if (i == str.size()) {
                i = 0;
            }
        }
        System.out.println("2. str.get(2)= " + str.get(2));
        System.out.println("3. str.size()= " + str.size());
        System.out.print("4. str.set(0, \"null\")= ");
        str.set(0, "null");
        System.out.println(str.get(0));
        for (String a : str) {
            System.out.println("   str: [" + i + "]= " + a);
            i++;
            if (i == str.size()) {
                i = 0;
            }
        }
        System.out.println("5. str.remove(0):");
        str.remove(0);
        for (String a : str) {
            System.out.println("   str: [" + i + "]= " + a);
            i++;
            if (i == str.size()) {
                i = 0;
            }
        }
        System.out.println();
        str.add(2, "122222");
        System.out.println();
        for (String a : str) {
            System.out.println("   str: [" + i + "]= " + a);
            i++;
        }

    }
}
