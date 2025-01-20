// Assignment 4.1: Queue Interface Implementation
interface Queue {
    void insert(int element);
    int delete();
    void display();
}

class ArrayQueue implements Queue {
    private int[] queue;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void insert(int element) {
        if (size == queue.length) {
            System.out.println("Queue is full. Cannot insert.");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        size++;
        System.out.println("Inserted: " + element);
    }

    @Override
    public int delete() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot delete.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println("Deleted: " + element);
        return element;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.display();
        queue.delete();
        queue.display();
    }
}

// Explanation: This implementation uses an interface for a queue with insert, delete, and display methods.
