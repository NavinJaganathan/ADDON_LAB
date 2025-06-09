package java_dsa;

public class day3_task3 {
    static class Node {
        int d; Node n;
        Node(int d) { this.d = d; }
    }
    Node head;

    void insert(int d) {
        if (head == null) head = new Node(d);
        else {
            Node c = head;
            while (c.n != null) c = c.n;
            c.n = new Node(d);
        }
    }

    void deleteAtPosition(int pos) {
        if (head == null) { System.out.println("List empty"); return; }
        if (pos == 0) { head = head.n; return; }
        Node c = head;
        for (int i = 0; i < pos - 1 && c != null; i++) c = c.n;
        if (c == null || c.n == null) {
            System.out.println("Position out of bounds");
            return;
        }
        c.n = c.n.n;
    }

    void traverse() {
        for (Node c = head; c != null; c = c.n)
            System.out.print(c.d + " -> ");
        System.out.println("null");
    }

    public static void main(String[] args) {
        day3_task3 l = new day3_task3();
        l.insert(10); l.insert(20); l.insert(30);
        System.out.println("Original list:"); l.traverse();
        l.deleteAtPosition(1);
        System.out.println("After deleting pos 1:"); l.traverse();
        l.deleteAtPosition(0);
        System.out.println("After deleting pos 0:"); l.traverse();
        l.deleteAtPosition(5);
}
}