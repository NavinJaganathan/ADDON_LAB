package java_dsa;
public class day6_task3 {
	int[] queue=new int[5];
	int size;
	int tail=-1;
	int fount=0;
	public void enqueue(int val) {
		if(tail==4) {
			System.out.println("overflow");
		}
		else {
			queue[++tail]=val;
		}
		
		//System.out.println(size)
		}
	public void deque() {
		if(fount>=4) {
			System.out.println("underflow");
		}
		else {
			//System.out.print();
		int d;
		d=queue[fount++];
		System.out.println(d+" - deleted");
		}
	}
	public void display() {
		for(int i=0;i<=tail;i++) {
			System.out.println(queue[i]);
		}
	}
	public static void main(String[] args){
		day6_task3 n=new day6_task3();
		n.enqueue(0);
		n.enqueue(1);
		n.enqueue(2);
		n.display();
		n.deque();
		n.deque();
		n.deque();
		n.deque();
		n.deque();
		n.display();
	}
}
