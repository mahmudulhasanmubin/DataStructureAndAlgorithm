package org.mubin.Algorithms;
//25

public class CalculateExecutionTime {

    public void run() throws InterruptedException {
        long start = System.nanoTime();
        //----------program----------

        Thread.sleep(3000);

        //---------------------------

        long duration = System.nanoTime() - start/1000000;
        System.out.println(duration + "ms");


    }
}
