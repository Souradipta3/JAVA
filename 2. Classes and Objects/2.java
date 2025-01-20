// Assignment 2.2: Stack Class with Push and Pop Operations
import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int value = stack.remove(stack.size() - 1);
        System.out.println("Popped: " + value);
        return value;
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.display();
        myStack.pop();
        myStack.display();
    }
}

// Explanation: This program implements a stack using an ArrayList, providing push, pop, and display methods.
