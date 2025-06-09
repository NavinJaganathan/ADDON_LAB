package java_dsa;

public class day3_main {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    void insert(int data) {
        if (head == null) head = new Node(data);
        else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = new Node(data);
        }
    }

    void reverse() {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void traverse() {
        for (Node cur = head; cur != null; cur = cur.next)
            System.out.print(cur.data + " -> ");
        System.out.println("null");
    }

    public static void main(String[] args) {
        day3_main list = new day3_main();
        list.insert(10); list.insert(20); list.insert(30);
        System.out.println("Original list:");
        list.traverse();

        list.reverse();
        System.out.println("Reversed list:");
        list.traverse();
    }
}
