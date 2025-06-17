package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day9_task3 {
	public static void countatterget(int[] a,int t) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				count++;
				
			}
		}
			System.out.println("count of target = "+count);
			//System.out.println("not found");
	}
public static void main(String[] args) {
	Scanner n =new Scanner(System.in);
	System.out.println("Enter a size of Array");
	int size=n.nextInt();
	int [] a=new int[size];
	System.out.println("Enter a element of arrays:");
	for(int i=0;i<a.length;i++) {
		int e=n.nextInt();
		a[i]=e;
	}
	System.out.println("Enter a target of Array");
	int t=n.nextInt();
	Arrays.sort(a);
	countatterget(a,t);
}
}
