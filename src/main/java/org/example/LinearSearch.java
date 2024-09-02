package org.example;
//8

public class LinearSearch {

    // Linear Search = Iterate through a collection one element at a time

    //                  runtime complexity: 0(n)

    //                  Disadvantages:
    //                  Slow for large data sets

    //                  Advantages:
    //                  Fast for searches of small to medium data sets
    //                  Doesn't need to sorted
    //                  Useful for data structure that do not have random access (LinkedList)
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = linearSearch(array, 8);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                return j;
            }
        }

        return -1;
    }
}
