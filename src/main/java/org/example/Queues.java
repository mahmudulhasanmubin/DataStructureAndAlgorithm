package org.example;
//2

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public void run() {

        //**************************************************************

        //Queue =  FIFO data structure. First-In--First-Out (Ex. A line of people)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure

        //          add     = enqueue, offer()
        //          remove  = dequeue, poll()

        //******************************************************************

        //add will be on the tail
        //1
        Queue<String> queue = new LinkedList<String>();

        //2.5
//        System.out.println(queue.isEmpty());//true, cause there is no element added.
        //2
        queue.offer("Karan");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //2.6
//        System.out.println(queue.isEmpty());//false, because I have added elements in the line.
        //2.7
//        System.out.println(queue.size());//4, cause there are 4 elements
        //2.8
//        System.out.println(queue.contains("Harold"));//true...check that element exists or not.

        //2.1
//        System.out.println(queue.peek());//Karan will be printed.
        //2.2
        queue.poll();//karan will be removed.
        queue.poll();//Chad will be removed.
        queue.poll();//Steve will be removed.
        queue.poll();//Harold will be removed.
        //2.3
//        queue.poll();//empty line. cause we have removed all elements.
        //2.4
//        queue.element();//NoSuchElementException will come.

        //2.1
        System.out.println(queue);

        //Where are queue useful?
        //1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        //2. Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedLists, PriorityQueues, Breadth-first search









    }
}
