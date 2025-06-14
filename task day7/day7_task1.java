package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day7_task1 {
	
    public static void FindBubble(int [] arr)
    {
    	for(int i=1;i<arr.length;i++) {
    		for(int j=0;j<arr.length-i;j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp = arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Arrays Size:");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter the Arrays Values:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
//		int [] arr = {1,34,2,45,56,7,3};
		FindBubble(arr);
	}
}
