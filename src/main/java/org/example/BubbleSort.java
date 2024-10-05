package org.example;
//11

public class BubbleSort {

    //bubble sort = pairs of adjacent elements are compared, and the elements
    //              swapped if they are not in order.

    //              Quadratic time O(n^2)
    //              small data set = okay-ish
    //              large data set = BAD (please don't use)

    public void run() {
        int[] array ={5, 63, 28, 927, 64654, 45, 457};

        bubbleSort(array);

       for(int i : array){
           System.out.println(i);
       }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1])//Ascending order
//              if (array[j] < array[j + 1])//Descending order
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
