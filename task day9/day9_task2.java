package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day9_task2 {

	public void upperbound(int[] arr, int target) {
		int left = 0;
		int right = arr.length;
		int mid;

		while (left < right) {
			mid = (left + right) / 2;

			if (arr[mid] < target) {
				left = mid;
			} else if (arr[mid] >= target) {
				right = mid-1;
			}
		}
		if (left == right) {
			System.out.println("upper bound found in index of " + left + " and value " + arr[left]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		day9_task2 n = new day9_task2();
		System.out.println("Enter the Size :");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the Values for Arrays :");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("enter the target element:");
		int target = sc.nextInt();

		n.upperbound(a, target);
		sc.close();
	}
}
