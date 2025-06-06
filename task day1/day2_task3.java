package dsa;

public class day2_task3 {
	    public static int removeDuplicates(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }	        
	        int i = 0; 
	        for (int j = 1; j < nums.length; j++) {  
	            if (nums[j] != nums[i]) {
	                i++;
	                nums[i] = nums[j];
	            }
	        }
	        return i + 1;
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
	        int length = removeDuplicates(arr);

	        System.out.println("Length of array after removing duplicates: " + length);
	        System.out.print("Array elements: ");
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}