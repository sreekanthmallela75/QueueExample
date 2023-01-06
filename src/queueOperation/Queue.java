package queueOperation;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Krishna");
        queue.add("Aadhya");
        queue.add("Vijay");
        queue.add("Ajay");
        queue.add("Ram");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        Iterator itr = queue.iterator();
        while (itr.hasNext()) ;
        System.out.println(itr.next());
        queue.remove();
        queue.poll();
        System.out.println("after the Deletion of two Elements");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}