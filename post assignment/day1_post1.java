package dsa_java;

import java.util.Scanner;

public class day1_post1 {

    static Scanner scanner = new Scanner(System.in);
    static int[] array = new int[100]; 
    static int size = 0; 

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("\n--- Array Manipulator ---");
        System.out.println("1. Insert element");
        System.out.println("2. Delete element");
        System.out.println("3. Display array");
        System.out.println("4. Find Max & Min");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                insertElement();
                break;
            case 2:
                deleteElement();
                break;
            case 3:
                displayArray();
                break;
            case 4:
                findMaxMin();
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }

        
        menu();
    }

    public static void insertElement() {
        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter position (0 to " + size + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
        size++;

        System.out.println("Element inserted.");
    }

    public static void deleteElement() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        System.out.println("Element deleted.");
    }

    public static void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void findMaxMin() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
