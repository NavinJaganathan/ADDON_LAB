package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day7_main {
	public static void FindBubble(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j+1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("<<SELECTION SORT>>\n");
		System.out.print("Enter the Arrays Size:");
		int size = sc.nextInt();
		System.out.print("Enter the Arrays Values:");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//			int [] arr = {1,34,2,45,56,7,3};
		FindBubble(arr);
		sc.close();
	}
}
