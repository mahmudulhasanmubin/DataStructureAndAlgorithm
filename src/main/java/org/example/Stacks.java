package org.example;
//1

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

        //0
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
//        stack.pop();//first it will remove "h"(last(top) element)
//        stack.pop();//it will remove "g"(2nd last element)
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();//remove "a" (bottom element)

        //3.
//        stack.pop();//EmptyStackException will create, cause there are only 8 elements, but we are trying to remove 9 element

        //3.1.
//        System.out.println(stack);

        //4
//        String myFavletter = stack.pop(); // h(top element) will be removed from the stack.
//        System.out.println(stack);
//        System.out.println(myFavletter);

        //5
//        System.out.println(stack.peek()); // h(top element) will be printed and element won't be removed from the stack.
//        System.out.println(stack);

        //6
//        System.out.println(stack.search("h")); //if I put h(top element) or b(2nd last element), it will show me where the position is!
//        System.out.println(stack.search("z")); //it will print -1. cause there is no "z" named element.

        //7
//        for (int i = 0; i<100000000; i++){
//            stack.push("k");
//        }//OutOfMemoryError will be there due to java heap space

        //uses of stacks?
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms (maze, file directories)
        //4. calling functions (call stack)












    }
}
