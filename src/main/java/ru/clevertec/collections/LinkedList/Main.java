package ru.clevertec.collections.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SimpleLinked<String> myLink = new SimpleLinked<>();

        myLink.add("666");
        myLink.addFirst("777");
        myLink.addLast("888");
        myLink.addLast("999");
        System.out.println();
        System.out.println("myLink.size()= " + myLink.size());
        System.out.println("myLink.get(0) = " + myLink.get(0));
        System.out.println("myLink.get(1) = " + myLink.get(1));
        System.out.println("myLink.get(2) = " + myLink.get(2));
        System.out.println();
       myLink.add(4 ,"9878990809");
        for (String a : myLink) System.out.println("Iterator: " + a);
        Iterator iter = myLink.descendingIterator();
        System.out.println();
        while (iter.hasNext()) {
            System.out.println("descendingIterator: " + iter.next());
        }
        System.out.println("myLink.getFirstElement:   "+myLink.getFirstElement());
        System.out.println("myLink.getLastElement:    "+myLink.getLastElement());
        System.out.println("myLink.set(2) = " + myLink.set(2, "5555555"));
        System.out.println("myLink.isEmpty() = " + myLink.isEmpty());
    }
}
