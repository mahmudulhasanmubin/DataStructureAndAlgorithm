package org.example;
//17

import java.util.Hashtable;

public class HashTables {

    //Hashtable =   A data structure that stores unique keys to values ex.<Integer, String>
    //              Each key/value pair is known as an Entry
    //              FAST insertion, look up, deletion of key/value pairs
    //              Not ideal for small data sets, great with large data sets.

    //hashing = takes a key and computes an integer (formula will vary based on key & data type)
    //          In a Hashtable, we use the hash % capacity to calculate an index number.

    //          key.hashCode() % capacity = index

    //bucket =  an indexed storage location for one or more Entries
    //          can store multiple Entries in case of a collision (linked similarly a LinkeList)

    //Collision = Hash function generates the same index for more than one key
    //              Less collisions = More efficiency

    //Runtime complex city: Best Case 0(1)
//                          Worst Case 0(1)

    public void run() {
        //1
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //2
//        table.remove(777);

        //1
        for (Integer key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
            //3
            System.out.println(key.hashCode() + "\t" +key + ": " + table.get(key));

        }



        //1.1
        Hashtable<String, String> tables = new Hashtable<>(10);
        tables.put("100", "Spongebob");
        tables.put("123", "Patrick");
        tables.put("321", "Sandy");
        tables.put("555", "Squidward");
        tables.put("777", "Gary");

        //2.1
//        tables.remove(777);

        //1.1
        for (String key : tables.keySet()) {
            System.out.println(key + ": " + tables.get(key));
            //3
            System.out.println(key.hashCode() + "\t" +key + ": " + tables.get(key));

            //**
            System.out.println(key.hashCode() % 23 + "\t" +key + ": " + tables.get(key));//memory address modulus

        }
    }
}
