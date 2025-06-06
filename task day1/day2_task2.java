package dsa_java;

import java.util.Scanner;

public class day2_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many spaces you need? ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = originalArray[i];
        }

      
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Sorted array in descending order:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}