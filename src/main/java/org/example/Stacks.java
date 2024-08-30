package org.example;

import java.util.Stack;

public class Stacks {
    //Data Structure : a named location that can be used to store and organize data

    //Example:      array
    //              a collection of elements stored at contiguous memory locations.

    //Algorithm : a collection of steps to solve a problem.

    //Example:      Baking a pizza
    //              1. Heat the oven to 550 degree Fahrenheit
    //              2. Knead the dough
    //              3. Add topings and blah blah blah...

    //Example:      Linear Search
    //              one by one, examine the elements of an array to find a value.

    //WHY LEARN DSA OR DS&A?
    //1. You'll write code that is both time and memory efficient.
    //2. Commonly asked questions involve DS&A in coding job interviews.

    //******************************************************************************

    public static void main(String[] args) {
        //Stack =   LIFO data structure. Last-In--First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to top
        //          pop() to remove from the top

        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());//before adding anything it will print "true".

        stack.push("a");//first store/bottom element
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        stack.push("g");
        stack.push("h");//top element

        //1.
//        System.out.println(stack.empty());//now it will print "false".

        //2.
        stack.pop();//first it will remove "h"(last element)
        stack.pop();//it will remove "g"(2nd last element)
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();//remove "a" (bottom element)

        //3.
//        stack.pop();//EmptyStackException will create, cause there are only 8 elements, but we are trying to remove 9 element

        //3.1.
        System.out.println(stack);

        String myFavletter = stack.pop();
        System.out.println(myFavletter);

        //not ended! I'm watching Bro Code YouTube channel.
        //need sleep now. 9:36am(30/08/24)










    }
}
