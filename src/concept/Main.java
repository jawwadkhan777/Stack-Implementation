package concept;

import concept.stack.DynamicStack;
import concept.stack.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack process
//        Stack<Integer> stack = new Stack<>(Integer.class,5);
        Stack<Integer> stack = new Stack<>(Integer.class);

        stack.push(4);
        stack.push(7);
        stack.push(15);
        stack.push(77);
        stack.display();
        System.out.println("Size of stack: "+stack.size());
        System.out.println("---------------------------------");

        stack.push(111);
        stack.display();
        System.out.println("Size of stack: "+stack.size());
        System.out.println("---------------------------------");

        System.out.println("Popped value: "+stack.pop());
        stack.display();
        System.out.println("Size of stack: "+stack.size());
        System.out.println("---------------------------------");

        System.out.println("Peek value: "+stack.peek());
        stack.display();
        System.out.println("Size of stack: "+stack.size());
        System.out.println("---------------------------------");

        System.out.println("Popped value: "+stack.pop());
        System.out.println("Popped value: "+stack.pop());
        System.out.println("Popped value: "+stack.pop());
        System.out.println("Popped value: "+stack.pop());
        stack.display();
        System.out.println("Size of stack: "+stack.size());
        System.out.println("---------------------------------");

        //Dynamic stack process
//        DynamicStack<Integer> dStack = new DynamicStack<>(Integer.class);
//
//        dStack.push(2);
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");
//
//        dStack.push(10);
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");
//
//        dStack.push(4);
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");
//
//        System.out.println("Popped value: "+dStack.pop());
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");
//
//        System.out.println("Popped value: "+dStack.pop());
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");
//
//        System.out.println("Popped value: "+dStack.pop());
//        dStack.display();
//        System.out.println("Size of stack: "+dStack.size());
//        System.out.println("---------------------------------");

    }
}