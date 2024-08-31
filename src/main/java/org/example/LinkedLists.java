package org.example;
//4

import java.util.LinkedList;

public class LinkedLists {

    //*******************************************************

    //LinkedList =  stores Nodes in 2 parts (data + address)
    //              Nodes are in non-consecutive memory locations
    //              Elements are linked using pointers

    //                          Singly Linked List
    //              Nodes                   Nodes               Nodes
    //          [data | address]    ->  [data | address]  ->    [data | address]

    //                          Doubly Linked List
    //              Nodes                   Nodes               Nodes
    //        [address | data | address]    ->  [address | data | address]  ->    [address | data | address]

    //          Advantages?
    //          1. Dynamic Data Structure (allocates needed memory while running)
    //          2. Insertion and Deletion of Nodes is easy. 0(1) means constant.
    //          3. No/Low memory waste

    //          Disadvantages?
    //          1. Greater memory usage (Additional pointer)
    //          2. No random access of elements (No index [i])
    //          3. Accessing/searching elements is more time-consuming. 0(n) means linear time.

    //          Uses?
    //          1. Implement Stacks/Queues
    //          2. GPS navigation
    //          3. Music playlist

    //doubly LinkedList takes more memory than singly LinkedList

    //****************************************************************************************************************

    public static void main(String[] args) {
        //1
        LinkedList<String> linkedList = new LinkedList<>();

        //1
//        linkedList.push("a");
//        linkedList.push("f");
//        linkedList.push("c");
//        linkedList.push("b");
//        linkedList.push("d");//this element will be removed by pop()
//        linkedList.pop();//LIFO, same as Stack.

        //2
        linkedList.offer("a");//this element will be removed by poll() method.
        linkedList.offer("f");
        linkedList.offer("c");
        linkedList.offer("b");
        linkedList.offer("d");
        linkedList.poll();//FIFO, same as Queue.

        //we can treat LinkedList as Stack and Queue both.

        //3
        linkedList.add("j");//this element will be added to the LinkedList.
        linkedList.remove("c");//this element will be removed and replaced by "j".
        //4
        System.out.println(linkedList.indexOf("d"));//search for "d" in the list.

        //1; 2; 3
        System.out.println(linkedList);
    }





}
