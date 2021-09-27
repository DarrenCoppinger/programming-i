package Counter;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Counter {
	public static void main(String[] args) {
		// Declare & create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		
		int userNumber = 0;
		int userNumberLength = 0; 
		boolean check = true;

		
		// Request input from user
		System.out.println("This program counts the number of digits in an integer entered by the user.");	
		System.out.println("Enter -1 to exit"); 
		
				
		do{
			if(userNumber!=-1) {
				try{
					System.out.print("Entered Number:");
					// Read in integer value and assign to variable
					userNumber = input.nextInt();
					
					userNumberLength = String.valueOf(userNumber).length();
					System.out.printf("Number of digits in %d is %d%n", userNumber, userNumberLength);
					check = false;
				}catch(InputMismatchException ime){
					System.out.println("Error: " + ime);	
					input.nextLine();			
				}
			}else {
				check = false;
			}
		}while(check);

		System.out.println("Program Terminated");
		
	}

}


/* 	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number: ");

boolean check = true;

do{
	try{
		int userNumber = input.nextInt();
		System.out.printf("You entered %d%n", userNumber);
		check = false;
	}catch(InputMismatchException ime){
		System.out.println("Error: " + ime);	
		input.nextLine();			
	}
}while(check);

System.out.println("Operation Over.");
} */