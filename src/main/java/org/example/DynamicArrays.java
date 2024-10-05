package org.example;
//5

import java.util.ArrayList;

public class DynamicArrays {

    //******************************************************************
    //      Advantages?
    //      1. Random access of elements 0(1)
    //      2. Good locality of reference and data cache utilization.
    //      3. Easy to insert/delete at the end.

    //      Disadvantage?
    //      1. Waste more memory.
    //      2. Shifting elements is time-consuming 0(n)
    //      3. Expanding/Shrinking the array is time-consuming 0(n)

    //      DynamicArrays also known in
    //      1. Java = ArrayList
    //      2. C++ = Vector
    //      3. Javascript = Array
    //      4. Python = List

    // Static Array has fixed capacity. Problem of this array is we can't increase/decrease capacity.

    //**********************************************************************

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrays() {
        this.array = new Object[capacity];
    }
    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if (size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert (int index, Object data){
        if (size >= capacity){
            grow();
        }
        for (int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;

    }
    public void delete(Object data){
        for (int i = 0; i < size; i++){
            if (array[i] == data){
                for (int j = 0; j < (size -i -1); j++){
                    array[i + j] = array[i + j +1];
                }
                array[size -1] = null;
                size--;
                if (size <= (int) capacity/3){
                    shrink();
                }
                break;
            }
        }

    }
    public int search (Object data){
        for (int i = 0; i < size; i++){
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity = (int) capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }
    private void shrink(){
        int newCapacity = (int) capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }
    public boolean isEmpty(){
        return size ==0;
    }
    public String toString(){

        String string ="";
        for (int i = 0; i < capacity; i++)//if we replace "size" with "capacity", we will see empty space also.
        {
            string += array[i] + "," ;
        }
        if (string !=""){
            string = "[" + string.substring(0,string.length()-2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }

    public void run() {

        ArrayList<String> arrayList = new ArrayList<String>();

        //1
//        DynamicArrays dynamicArrays = new DynamicArrays(5);
        //2
        DynamicArrays dynamicArrays = new DynamicArrays();

        dynamicArrays.add("A");
        dynamicArrays.add("B");
        dynamicArrays.add("C");
        dynamicArrays.add("D");
        dynamicArrays.add("E");
        dynamicArrays.add("F");

        //5
//        dynamicArrays.insert(0,"X");

        //6
//        dynamicArrays.delete("A");

        //7
//        dynamicArrays.search("C");
//        System.out.println(dynamicArrays.search("C"));

        //8
        dynamicArrays.delete("A");//delete and decrease the capacity
        dynamicArrays.delete("B");//delete and decrease the capacity
        dynamicArrays.delete("C");//delete and decrease the capacity

        //2
        System.out.println(dynamicArrays);

        //4
        System.out.println("size: " + dynamicArrays.size);

        //3
        System.out.println("empty: " + dynamicArrays.isEmpty());

        //1
        System.out.println("Capacity: " + dynamicArrays.capacity);



    }







}
