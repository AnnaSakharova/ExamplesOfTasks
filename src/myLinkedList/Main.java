package myLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContainer<String> linkedContainer = new LinkedContainer<>();
        linkedContainer.addFirst("a");
        linkedContainer.addFirst("b");
        linkedContainer.addFirst("c");
        linkedContainer.addFirst("d");
//
//        for (String s : linkedContainer) {
//            System.out.println(s);
//        }
//
        Iterator<String> iterator = linkedContainer.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
