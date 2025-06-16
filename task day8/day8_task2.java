package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day8_task2 {
//	int[] arr = { 21, 3, 45, 6, 76, 87, 90, 46, 1, 10 };
	
	public void bynarysort(int[] find,int fin) {
			int left = 0;
			int right = find.length - 1;
			int mid = (left + right) / 2;
			if (find[mid]==fin) {
				System.out.println("Value found " + find[mid] + " at index " + mid);
				
			}
			else if (fin > find[mid]) {
				left = mid + 1;
				bynarysort( find,fin);
			}
			else if (fin < find[mid]) {
				right = mid - 1;
				bynarysort(find,fin);
			
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	day8_task2 n = new day8_task2();
	System.out.println("Enter the Size :");
	int size = sc.nextInt();
	
	int[] a = new int[size];
	System.out.println("Enter the Values for Arrays :");
	
	for(int i=0;i<size;i++) {
		a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println("enter the finding element:");
	int fin=sc.nextInt();
	
	n.bynarysort(a,fin);
}
}