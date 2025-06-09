package java_dsa;
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
public class day3_task1 {
	
	    Node head;
	    void insert(int data) {
	        if (head == null) head = new Node(data);
	        else {
	            Node curr = head;
	            while (curr.next != null) curr = curr.next;
	            curr.next = new Node(data);
	        }
	    }
	    void traverse() {
	        for (Node curr = head; curr != null; curr = curr.next)
	            System.out.print(curr.data + " -> ");
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        day3_task1 list = new day3_task1();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.traverse(); 
	    }
	}


