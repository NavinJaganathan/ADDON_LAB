package dsa_java;

import java.util.Scanner;

public class day1_task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size + 1]; 
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position to insert the element at (0-based index): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position. Must be between 0 and " + size);
        } else 
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }

            
            array[position] = element;

          
            System.out.print("Array after insertion: ");
            for (int i = 0; i <= size; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }

