package org.mubin;

//Everything will be run from one main class.
//One application needs only one main class.
//Don't add {public static void main(String[] args)} to every class.


import org.mubin.Algorithms.*;
import org.mubin.DataStructures.*;
import org.mubin.Searching.*;
import org.mubin.Sorting.*;

public class MainRunner {

    public static void main(String[] args) throws InterruptedException {

//        AdjacencyList adjacencyList = new AdjacencyList();
//        adjacencyList.run(); //getting NullPointExceptions

        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix();
        adjacencyMatrix.run();

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.run();

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.run();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.run();

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.run();

        DynamicArrays dynamicArrays = new DynamicArrays();
        dynamicArrays.run();

        HashTables hashTables = new HashTables();
        hashTables.run();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.run();

        InterpolationSearch interpolationSearch = new InterpolationSearch();
        interpolationSearch.run();

        LinearSearch linearSearch = new LinearSearch();
        linearSearch.run();

        MergeSort mergeSort = new MergeSort();
        mergeSort.run();

        PriorityQueues priorityQueue = new PriorityQueues();
        priorityQueue.run();

        Queues queues = new Queues();
        queues.run();

        QuickSort quickSort = new QuickSort();
        quickSort.run();

        Recursion recursion = new Recursion();
        recursion.run();

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.run();

        Stacks stacks = new Stacks();
        stacks.run();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.run();

        CalculateExecutionTime calculateExecutionTime = new CalculateExecutionTime();
        calculateExecutionTime.run();

    }
}
