package dsa_java;

import java.util.Scanner;

public class day1_post2 {

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

   
    public static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

  
    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / power(x, -n);
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number for sum of digits: ");
        int num = scanner.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));

        
        System.out.print("Enter a number for factorial: ");
        int factNum = scanner.nextInt();
        System.out.println("Factorial: " + factorial(factNum));

        
        System.out.print("Enter a number for Fibonacci term: ");
        int fibNum = scanner.nextInt();
        System.out.println("Fibonacci term: " + fibonacci(fibNum));

        
        System.out.print("Enter a string to reverse: ");
        scanner.nextLine();  
        String str = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(str));

        System.out.print("Enter base number (x): ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent (n): ");
        int exponent = scanner.nextInt();
        System.out.println("Result of " + base + "^" + exponent + " = " + power(base, exponent));

        scanner.close();
    }
}
