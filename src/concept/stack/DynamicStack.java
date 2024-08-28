package concept.stack;

import java.lang.reflect.Array;

public class DynamicStack<T> extends Stack<T>{

    private int capacity = 2; //initial capacity of stack
    private final Class<T> c; //declaration of a variable c of type Class<T>, where T is a generic type parameter

    //constructor
    public DynamicStack(Class<T> c) {
        super(c, 2);
        this.c = c;
    }

    @Override
    //inserts the element into top of the stack
    public void push(T data) {
        if (size()==capacity) {
            expand();
        }
        super.push(data);
    }

    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generics
    //provides dynamic array feature to the stack (in terms of expanding)
    private void expand() {
        int length = size(); //Get the current number of elements in the stack
        T [] newStack = (T[]) Array.newInstance(c, capacity*2); //Create a new array of double the capacity
        System.arraycopy(stack, 0, newStack, 0, length); //Copy elements from the old stack to the new one
        stack = newStack; //Assign the new array to the stack
        capacity *= 2; //Update the capacity to the new doubled value
    }

    @Override
    //removes the top element from the stack
    public T pop() {
        shrink();
        return (T) super.pop();
    }

    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generics
    //provides dynamic array feature to the stack (in terms of shrinking)0
    private void shrink() {
        int length = size()-1; // Get the current number of elements in the stack
        if (length<=capacity/4) {
            capacity = capacity / 2; // If the number of elements is less than or equal to a quarter of the capacity, reduce the capacity by half

            T[] newStack = (T[]) Array.newInstance(c, capacity); // Create a new array with the reduced capacity
            System.arraycopy(stack, 0, newStack, 0, length); // Copy the elements from the old stack to the new stack
            stack = newStack; // Set the new stack as the current stack
        }
    }

    @Override
    //prints the stack
    public void display() {
        System.out.print("Stack: ");
        if (isEmpty()) {
            System.out.println("Nothing in the stack!");
            System.out.println("Capacity of stack: "+capacity);
            return;
        }
//        for (int i=0; i<top; i++) {
//            System.out.print(stack[i]+" ");
//        }
        for (Object element : stack) {
            System.out.print(element+ " ");
        }
        System.out.println("\nTop of stack: "+stack[top-1]);
        System.out.println("Capacity of stack: "+capacity);
    }
}
