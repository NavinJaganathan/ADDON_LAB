package connection;

import java.sql.SQLException;
import java.util.Scanner;

public class inventory {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			inventory n=new inventory();
			 Scanner sc = new Scanner(System.in);
		     int choice , data;

		        while (true) {
		            System.out.println("\n--- Menu ---");
		            System.out.println("1. Create Table ");
		            System.out.println("2. Insert Values");
		            System.out.println("3. Delete Values");
		            System.out.println("4. Retrive Values");	           
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    createtable.createTable();
		                    break;
		                case 2:
		                    insertvalues.insertvalues();
		                    break;
		                case 3:
		                	System.out.println("Enter the Data(ex: id)");
		                	 data = sc.nextInt();
		                	deletedata.deletevalues(data);
		                    break;
		                case 4:
		                	retrivedata.retrivevalues();
		                    break;
		                case 5:
		                    System.out.println("Exiting...");
		                    sc.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice! Try again.");
		            }
		        }
	}
}
	
