package org.example;
//14

public class Recursion {

    //Recursion = when a thing is defined in terms of itself. - Wikipedia
    //              Apply the result of a procedure, to a procedure.
    //              A recursive method calls itself. Can be a substitute for iteration.
    //              Divide a problem int sub-problems of the same type as the original.
    //              Commonly used with advanced sorting algorithms and navigating trees.

    //              Advantages:
    //              1. easier to read/write
    //              2. easier to debug

    //              Disadvantages:
    //              1. Sometimes slower
    //              2. Uses more memory

    //recursive uses LIFO
    //recursion: call itself, parameter values{ walk(int steps) }, converge towards base case, base case = true, less code, more memory, slower
    //iteration: uses loops, control index { int steps = 0) }, move toward value in condition, index satisfies condition, more code, less memory, faster

    public static void main(String[] args) {

        walk(5);

        factorial(7);
        System.out.println("factorial: " + factorial(7));

        power(2, 8);
        System.out.println("result: " + power(2, 8));
    }

    private static int factorial(int num) {
        if (num < 1) return 1;//base case
        return num * factorial(num - 1);
    }

    private static void walk(int steps) {
//        for (int i = 0; i < steps; i++) {
//            System.out.println("You take a step");
//        }
        if (steps < 1)return; //base case
            System.out.println("You take a step!");
            walk(steps - 1);//recursive case
    }
    private static int power (int base, int exponent){
        if(exponent<1) return 1;//base case
        return base*power(base, exponent - 1);//recursive case

    }
}
