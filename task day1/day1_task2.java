package dsa_java;

import java.util.Scanner;

public class day1_task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

      
        int max = array[0];
        int min = array[0];


        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        scanner.close();
    }
}
