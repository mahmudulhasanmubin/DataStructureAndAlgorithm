package org.example;
//9

import static java.util.Arrays.binarySearch;

public class BinarySearch {

    //                  Binary Search
    //      Search algorithm that finds the position of a target value within a sorted array.
    //      Half of the array is eliminated during each "step"

    //                      value = "k";
    //                      index = ?;

    public static void main(String[] args) {

        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " Element not found");
        } else {
            System.out.println(target + " Element found at index " + index);
        }
    }

        private static int binarySearch(int[] array, int target){
            int low = 0;
            int high = array.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int value = array[mid];

                System.out.println("middle element: " + value);

                if (value < target){
                    low = mid + 1;
                }
                else if (value > target){
                    high = mid - 1;
                }
                else{
                    return mid;//target found
                }
            }
            return -1;//target not found
        }



}
