package collectionFramework.listAndSet;

import java.util.PriorityQueue;

public class Lab_Queue {
    public static void main(String[] args) {
//        0.01% --> Automation
//        FIFO : Fast In Fadst Out
        PriorityQueue pq = new PriorityQueue();
        pq.offer("Mango");
        pq.offer("Apple");
        pq.offer("Orange");
        pq.offer("Banana");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
//        poll is like push in Stack
        System.out.println(pq);

    }
}
