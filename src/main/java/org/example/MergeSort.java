package org.example;
//15

public class MergeSort {

    //merge sort = recursively divide array in 2, sort, re-combine
    //run-time complexity = 0(n log n)
    //space complexity = 0(n)
    public static void main(String[] args) {

        int[] array = {8, 2, 5, 3, 4, 7, 6,2};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;//base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
//        int i =0;//left array
//        int j = 0;//right array
//        for(; i < middle; i++) {
//            if (i < middle) {
//                leftArray[i] = array[i];
//            }
//            else {
//                rightArray[j] = array[i];
//                j++;
//            }
//        }//avoid this
        for(int i=0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for(int i=middle; i < length; i++) {
            rightArray[i-middle] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    public static void merge(int[] leftArray, int[] rightArray,int[] array) {

        int leftSize = array.length/2;
        int rightSize = array.length -leftSize;
        int i =0, l = 0, r = 0;//indices

        //check the conditions for margin
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }

        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }

}
