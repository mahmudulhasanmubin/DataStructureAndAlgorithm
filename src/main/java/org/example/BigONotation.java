package org.example;
//7

public class BigONotation {

    //                          "How code slow as data grows."
    //                  1. Describes the performance of an algorithm as the amount of data increases
    //                  2. Machine independent (# of steps to completion)
    //                  3. Ignore smaller operations 0(n + 1) -> 0(n)

    //                  [ n = amount of data] (it's a variable like x)

    //  0(1)       = constant time
    //               - random access of an element in an array
    //               - inserting at the beginning of linkedlist

    //  0(log n)      = logarithmic time
    //                 - binary search

    // 0(n)            = linear time
    //                  - looping through elements in an array
    //                  - searching through a linkedlist

    //  0(n log n)      = quasilinear time
    //                   - QuickSort
    //                   - MergeSort
    //                   - HeapSort

    //  0(n^2)          = quadratic time
    //                   - InsertionSort
    //                   - SelectionSort
    //                   - BubbleSort

    // 0(n!)            = factorial time
    //                   - Traveling Salesman Problem


    //**********************************************************************
    //                              0(n) linear time

//    int addUp(int n){
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }
    //n= 10000000000
    // ~ 10000000000 steps

    //**********************************************************************

    //                              0(1) constant time

//    int addUp(int n){
//        int sum = n * (n + 1) / 2;
//        return sum;
//    }
    //n= 100000000000
    // 3 steps

    //************************************************************************



}
