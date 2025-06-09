package java_dsa;

public class day3_task2 {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }
    static class SinglyLinkedList {
        Node head;
        void insert(int d) {
            if (head == null) head = new Node(d);
            else {
                Node cur = head;
                while (cur.next != null) cur = cur.next;
                cur.next = new Node(d);
            }
        }
        void insertAtPosition(int d, int pos) {
            Node n = new Node(d);
            if (pos == 0) { n.next = head; head = n; return; }
            Node cur = head;
            for (int i = 0; i < pos - 1 && cur != null; i++) cur = cur.next;
            if (cur == null) { System.out.println("Position out of bounds"); return; }
            n.next = cur.next; cur.next = n;
        }
        void traverse() {
            for (Node cur = head; cur != null; cur = cur.next)
                System.out.print(cur.data + " -> ");
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10); list.insert(20); list.insert(30);
        System.out.println("Original list:");
        list.traverse();
        list.insertAtPosition(15, 1);
        System.out.println("After inserting 15 at position 1:");
        list.traverse();
        list.insertAtPosition(5, 0);
        System.out.println("After inserting 5 at position 0:");
        list.traverse();
        list.insertAtPosition(40, 10);  // Out of bounds
    }
}
