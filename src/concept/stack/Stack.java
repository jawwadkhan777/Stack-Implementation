package concept.stack;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
public class Stack<T> {

    protected T[] stack; //declares stack
    private final int capacity = 4; //capacity of stack
    protected int top = 0; //top of stack, initially zero

    //constructor
    public Stack(Class<T> c) {
        stack = (T[]) Array.newInstance(c, capacity);
        System.out.println("Stack Implementation");
        System.out.println("--------------------");
    }

    //constructor
    public Stack(Class<T> c, int capacity) {
        stack = (T[]) Array.newInstance(c, capacity);

        // Check if 'this' is an instance of DynamicStack
        if (this instanceof DynamicStack<T>) {
            System.out.println("Dynamic Stack Implementation");
            System.out.println("----------------------------");
        }
        else {
            System.out.println("Stack Implementation");
            System.out.println("--------------------");
        }

    }

    //inserts the element into top of the stack
    public void push(T data) {
        if (top==stack.length) {
            System.out.println("Stack is full, not added!");
            return;
        }
        stack[top] = data;
        top++;
    }

    @SuppressWarnings("unchecked")
    //removes the top element from the stack
    public T pop() {
        if (isEmpty()) {
            return (T) "Stack is empty, nothing popped!";
        }
        top--;
        T data = stack[top];
        stack[top] = null;
        return data;
    }

    //returns the top element of the stack
    public T peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty, not peek!");
        }
        return stack[top-1];
    }

    //returns the size of the stack
    public int size() {
        return top;
    }

    //checks the stack is empty or not
    public boolean isEmpty() {
        return top<=0;
    }

    //prints the stack
    public void display() {
        System.out.print("Stack: ");
        if (isEmpty()) {
            System.out.println("Nothing in the stack!");
            System.out.println("Capacity of stack: "+capacity);
            return;
        }
        for (int i=0; i<top; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println("\nTop of stack: "+stack[top-1]);
        System.out.println("Capacity of stack: "+capacity);
    }
}
