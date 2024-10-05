package org.example;
//3

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public void run() {

        //Priority Queue = A FIFO data structure that serves elements
        //                  with the higher priorities first
        //                  before elements with lower priority

        //1; 2.1
//        Queue<Double> queue = new LinkedList<Double>();//changed to PriorityQueue
        //2.2
        Queue<Double> queue = new PriorityQueue<>();

        //2
        queue.offer(3.0);
        queue.offer(4.2);
        queue.offer(1.5);
        queue.offer(2.8);
        queue.offer(5.0);

        //2.1
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }//Same order print

        //2.2
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }//Ascending Order print, cause priority queue. no need to add any method.
        //if we need Descending order print, we have to do  "Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());"



    }

}
