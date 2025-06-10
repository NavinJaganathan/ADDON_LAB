package java_dsa;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}
class revssl01 {
    node head;
    void insert(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        
    }
    void reverse() {
        node prev = null;
        node current = head;
        node next = null;

        while (current != null) {
            next = current.next;     
            current.next = prev;    
            prev = current;          
            current = next;          
        }

        head = prev; 
    }
}

public class day3_main {
    public static void main(String[] args) {
        revssl01 list = new revssl01();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();
    }
}
