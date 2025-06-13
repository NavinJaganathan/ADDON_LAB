package java_dsa;
public class day6_task1 {
		int[] stack=new int[5];;
		int size=0;
		int top=-1;
		
		public void push(int n) {
			if(top==4) {
				System.out.println("stack is full");
			}
			else {
				//System.out.print();
				stack[++top]=n;
				size++;
			}
			//System.out.println(size);
			}
		public void pop() {
			if(top==-1) {
				System.out.println("underflow");
			}
			else {
				//System.out.print();
				int d;
				d=stack[top--];
				System.out.println(d+" - popped out");
				size--;
			}
		}
		public void display() {
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}
public static void main(String []args) {
	day6_task1 n=new day6_task1();
	n.push(0);
	n.push(1);
	n.push(2);
	//n.push(2);
	
	n.display();
	System.out.println("");
	n.pop();
	n.pop();
	n.pop();
	n.pop();
	n.display();
}
}