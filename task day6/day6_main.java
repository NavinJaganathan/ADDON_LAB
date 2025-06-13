package java_dsa;

class Queue {
    int size = 5;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;

    // Enqueue operation
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full (Overflow).");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty (Underflow).");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);
        front++;
    }

    // Display current queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("The queue is empty.");
            return;
        }

        System.out.print("Current queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class day6_main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Will show overflow
        q.display();
    }
}
