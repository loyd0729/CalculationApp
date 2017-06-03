/*This application calculates and displays
 * results of addition, subtraction, 
 * multiplication, division, modulus,
 * bitwise &, or bitwise| on two integers
 * input by the user. The program should
 * prompt the user for the two integers and 
 * the operation to be performed.
 */

import java.util.Scanner;

public class DifferentCalculationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("operation: ");
        String operation = sc.nextLine();
        
		//Performs addition 
		 if (operation.equals("+")) {
			
			 	System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
			
				int addition = firstInteger + secondInteger;
			
				System.out.println("The results of " + firstInteger + " " +  
									operation + " " + secondInteger + " " +
									"is " + addition);
		 }
		 
		 //Performs subtraction
		 else if (operation.equals("-")) {
				
			 	System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int subtraction = firstInteger - secondInteger;
				
				System.out.println("The results of " + firstInteger + " " +  
									operation + " " + secondInteger + " " +
									"is " +  subtraction);
			 }
		 
		 //Performs multiplication
		 else if (operation.equals("*")) {
				
			 	System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int multiplication = firstInteger * secondInteger;
				
				System.out.println("The results of " + firstInteger + " " +  
									operation + " " + secondInteger + " " +
									"is " +  multiplication);
			 }
		 
		 //Performs division
		 else if (operation.equals("/")) {
				
			 	System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int division = firstInteger / secondInteger;
				
				System.out.println("The results of " + firstInteger + " " + 
									operation + " " + secondInteger + " " +
									"is " +  division);
			 }
		 
		 //Performs modulus
		 else if (operation.equals("%")) {
				
			 	System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int modulus = firstInteger % secondInteger;
				
				System.out.println("The results of " + firstInteger + " " + 
									operation + " " + secondInteger + 
									" " + "is " +  modulus);
			 }
		 
		 //Performs bitwise &
		 else if (operation.equals("&")) {
				
				System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int bitwiseAnd = firstInteger & secondInteger;
				
				System.out.println("The results of " + firstInteger + " " + 
									operation + " " + secondInteger + 
									" " + "is " +  bitwiseAnd);
			 }
		 
		 //Performs bitwise |
		 else if (operation.equals("|")) {
				
				System.out.print("Enter first Integer: ");
				int firstInteger = sc.nextInt();
				
				System.out.print("Enter second Integer: ");
				int secondInteger = sc.nextInt();
				
				int bitwiseOr = firstInteger & secondInteger;
				
				System.out.println("The results of " + firstInteger + " " + 
									operation + " " + secondInteger + 
									" " + "is " +  bitwiseOr);
			 }
		 
		 else {
			 
			 System.out.println("Ang tanga mo! mali! re-compile!");
		 }
		 
		sc.close();
        System.out.println("aight!");
       }
	}
	
