package java_dsa;

public class day5_task2 {
			node last=null;
		public void insert(int val) {
			node newnode=new node(val);
			if(last==null) {
				newnode.next=newnode;
				last=newnode;
			}
			else {
				 newnode.next=last.next;
				 last.next=newnode;
				 last=newnode;
			}
		}
		public void insertatend(int val) {
			node newnode=new node(val);
				newnode.next=last.next;
				last.next=newnode;
				last=newnode;
			}
	public void display() {
		node temp=last.next;
		while(true) {
			System.out.println(temp.data+" ");
			temp=temp.next;
			if(temp==last.next) {
				break;
			}
	}
	}
	public static void main(String[] args) {
		day5_task2 n=new  day5_task2();
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.display();
		System.out.println(" insert at end");
		
		n.insertatend(5);
		n.insertatend(6);
		
		System.out.println();
		n.display();
	}
}


