//// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		
		int availableSeats = 13;
		
				
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGroceries = 25.87;
		

		// 3. Create a variable to hold a person's middle initial
		
		char middleInitial = 'T';
		
		
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
         boolean isHotOutside = true;

         
         
		// 5. Create a variable to hold a customer's first name
         
         String firstName = "Yenny";
         
         
		// 6. Create a variable to hold a street address
         
		String streetName = "733 S Central";
		

		// 7. Print all variables to the console
		System.out.println(availableSeats);
		System.out.println(costOfGroceries);
		System.out.println(middleInitial);
        System.out.println(isHotOutside);
        System.out.println(firstName);
    	System.out.println(streetName);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	    availableSeats = availableSeats - 2;

        System.out.println(availableSeats);
        
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
        costOfGroceries = costOfGroceries + 2.15;
        
        System.out.println(costOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'G';
				System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
         isHotOutside = false;
         
         System.out.println(isHotOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	String fullName2 = firstName + " " + middleInitial + " " + "Flores";
	
	System.out.println(fullName2);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
     System.out.println("Hi, my name is " + fullName2 + " and i live at " + streetName);
		
     
		
	}
}