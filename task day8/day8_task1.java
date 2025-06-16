package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day8_task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 12, 32, 45, 67, 43, 90, 8 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the Values to Find :");
		int find = sc.nextInt();

		boolean flag = false;
		

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("Value " + find + " Found at the index of :" + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Value Not Found");
		}
	}
}
