package java_dsa;

public class day5_main {
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
	public void delatpos(int pos) {
		node temp=last;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
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
		day5_main n=new  day5_main();
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.insert(4);
		n.display();
		System.out.println("delete at beginning");
		n.delatpos(3);
		n.display();
	}
}
