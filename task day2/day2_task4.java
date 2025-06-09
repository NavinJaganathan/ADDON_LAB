package java_dsa;

public class day2_task4 {
	 public static void main(String[] args) {
	        String a="madam";
	        int i=0;
	        int j=a.length() -1;
	        boolean pallindrome=true;
	        while(i<j){
	        if (a.charAt(i)!=a.charAt(j)){
	            pallindrome=false;
	            break;
	        }
	        i++;
	        j--;
	        }
	        if(pallindrome==true){
	            System.out.println("is pallindrome");
	        }
	        else{
	             System.out.println("is not pallindrome");
	        }
	    }
	}

