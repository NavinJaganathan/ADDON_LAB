package java_dsa;

public class day4_task1 {

    class node {
        int data;
        node prev;
        node next;
        node(int val) {
            this.data = val;           
            this.prev = null;
            this.next = null;
        }
    }
    node head = null;
    node tail = null;
    void insert(int val) {
        node newnode = new node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode = null;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    void display() {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;     
         }
    }
    public static void main(String[] args) {
        day4_task1 n = new day4_task1();
        n.insert(0);
        n.insert(2);
        n.insert(3);
        n.display();  
    }
}
