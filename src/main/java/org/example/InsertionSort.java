package org.example;
//13
public class InsertionSort {

    //Insertion Sort = after comparing elements to the left
    //                  shift elements to the right to make room to insert a value

    //                  Quadratic time 0(n^2)
    //                  small data set = decent
    //                  large data set = BAD

    //                  Less steps than Bubble Sort
    //                  Best case is 0(n) compared to Selection Sort 0(n^2)

    public void run() {
        int[] array = {4, 5, 6, 3, 2, 1, 9, 15, 7};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }

}
