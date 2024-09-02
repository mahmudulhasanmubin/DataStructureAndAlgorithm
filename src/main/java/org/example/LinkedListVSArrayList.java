package org.example;
//6

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        //***********************LinkedList******************

        //Taking more time cause LinkedList is "doubly LinkedList"

        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(5000);
//        linkedList.get(999999);
//        linkedList.remove(0);//faster than ArrayList. Cause ArrayList needs to remove and then shift all elements to left.
        linkedList.remove(5000);//faster than ArrayList


        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");





        //************************ArrayList*********************

        startTime = System.nanoTime();

//        arrayList.get(0);//ArrayList is faster than LinkedList
//        arrayList.get(5000);//faster than LinkedList
//        arrayList.get(999999);//faster than LinkedList
//        arrayList.remove(0);
        arrayList.remove(5000);


        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: " + elapsedTime + " ns");

    }




}
