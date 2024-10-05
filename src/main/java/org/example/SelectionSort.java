package org.example;
//12

public class SelectionSort {

    //Selection Sort = search through an array and keep track of the minimum value during
    //                  each iteration. At the end of each iteration, we swap variables.

    //                  Quadratic time 0(n^2)
    //                  small data set = okay
    //                  large data set = BAD

    public void run() {
        int [] array = {3, 8, 1, 56, 5, 3, 7};

        selectionSort(array);

        for(int i: array){
            System.out.println(i + " ");
        }
//        for (int i = 0; i < array.length; i++) {
//            int min = array[i];
//            int minIndex = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                    minIndex = j;
//                }
//            }
//        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j])//Ascending order
//              if(array[min] < array[j])//Descending order
                {
                    min = j;
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
