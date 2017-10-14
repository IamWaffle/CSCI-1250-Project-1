/*********************************************************************************** * 
------------------------------------------------------------------------------------ 
* 	  File name: Project2.java 
*     Project name: CSCI 1250 Project 2 
* ------------------------------------------------------------------------------------ 
*     Author Name: Ryan 
*     Author E-mail: shuper@etsu.edu 
*     Course-Section: CSCI-1250-004
*     Creation Date: 10/13/17 
*     Date of Last Modification: 10/13/17 
* ------------------------------------------------------------------------------------ */
import java.util.Scanner;
import java.text.DecimalFormat;

/*********************************************************************************** 
 * Class Name: Project2 <br> 
 *  Class Purpose: Project 2 <br> 
 *  
 *   <hr> 
 *   Date created: 10/13/17 <br> 
 *   Date last modified: 10/13/17 
 *   @author Ryan Shupe */

public class Project2 {
	
	public static void main(String[] args){
		
		final double PRICE_ADULT; //Price of the adult ticket	*CONSTANT*
		final double PRICE_OTHER; //Price of the elder/child ticket *CONSTANT*
		final double SHIPPING; //Price of Shipping *CONSTANT*
		final double DISCOUNT; //Percent of discount *CONSTANT*

		double totalPriceAdult; //Total price of adult tickets
		double totalPriceOther;//Total price of elder/child tickets
		double totalPrice;	//Total price all together
		double finalPriceDiscount; //Total price discount included
		double discountPrice; //Total price of the discount
		
		int option; //option number
		int numAdult; //number of adult tickets
		int numOther; //number of other tickets
		int screenClear; //how many lines to println
		
		char repeat; //holds a y or n to repeat the program or not
		
		

		PRICE_ADULT = 10.00;
		PRICE_OTHER = 5.00;
		
		SHIPPING = 5.00;
		DISCOUNT = .10;
		
		screenClear = 35;
		
		Scanner input = new Scanner(System.in); 
		
        DecimalFormat formatCash = new DecimalFormat("$ #,##0.00");// format doubles
        DecimalFormat formatPerc = new DecimalFormat("00.0%");
		
        String fShipping = formatCash.format(SHIPPING);
        String fPercent = formatPerc.format(DISCOUNT);
		
        
        
        System.out.println ("******WELCOME TO THE TICKET PRICE CALCULATOR******"); //introduction screen
		System.out.println ("              Created by: Ryan Shupe              ");
		System.out.println();
		System.out.println();
		System.out.println("              --Press ENTER to Continue--           ");
		input.nextLine();
		
		do {
			System.out.print("How many adult tickets do you wish to purchase? (ages 18-64) ");
			numAdult = input.nextInt(); //gets number of adult tickets
			
			while (numAdult < 0) {
				System.out.println("Please enter a positive number...");
				System.out.print("How many adult tickets do you wish to purchase? (ages 18-64) ");
				numAdult = input.nextInt(); //gets number of adult tickets
			}
		
			System.out.print("How many student/senior tickets do you wish to purchase? (ages 0-17 or 65+) ");
			numOther = input.nextInt(); //gets number of other tickets
			
			while (numOther < 0) {
				System.out.println("Please enter a positive number...");
				System.out.print("How many student/senior tickets do you wish to purchase? (ages 0-17 or 65+) ");
				numOther = input.nextInt(); //gets number of other tickets
			}

			for (int i = 0; i < screenClear; i++){ //clears screen
				System.out.println();
			}
			
			System.out.println ("Please make a selection from the menu options below for additional savings");
			System.out.println();
			System.out.println ("              Savings Menu               ");
			System.out.println ("             --------------              ");
			System.out.println ("          1. Free Shipping               ");
			System.out.println ("          2. "+ fPercent +" discount              ");
			System.out.println ("          3. Apply whichever discount will save me the most money");
			System.out.println();
			System.out.print("           Enter your selection: ");
			option = input.nextInt();
			
			while (option < 1 || option > 3) {
				for (int i = 0; i < screenClear; i++){ //clears screen
					System.out.println();
				}
				
				System.out.println ("****ERROR! Please input a valid number.****");
				System.out.println ("Please make a selection from the menu options below for additional savings");
				System.out.println();
				System.out.println ("              Savings Menu               ");
				System.out.println ("             --------------              ");
				System.out.println ("          1. Free Shipping               ");
				System.out.println ("          2. "+ fPercent +" discount              ");
				System.out.println ("          3. Apply whichever discount will save me the most money");
				System.out.println();
				System.out.print("           Enter your selection: ");
				option = input.nextInt();
			
			}
				
	

			for (int i = 0; i < screenClear; i++){ //clears screen
				System.out.println();
			}

			totalPriceAdult = PRICE_ADULT * numAdult; //calculates price for the Adult tickets
			totalPriceOther = PRICE_OTHER * numOther; //calculates price for the Other tickets
		
			totalPrice = totalPriceOther + totalPriceAdult; //calculates total price of all the tickets
		
			discountPrice = DISCOUNT * totalPrice; //calculates total discount price
		
			finalPriceDiscount = totalPrice - discountPrice + SHIPPING; 	//calculates price with discount and shipping
		
        	String fTotalPrice = formatCash.format(totalPrice);
        	String fTotalPriceDiscount = formatCash.format(finalPriceDiscount);
        	String fDiscountPrice = formatCash.format(discountPrice);

			switch (option) {
				case 1: //happens if user enters 1
						System.out.println("		Purchase Price: " + fTotalPrice);
						System.out.println("		Discount Applied $-0.00");
						System.out.println("		Shipping: $0.00 FREE SHIPPING");
						System.out.println("-------------------------------------------------------------");
						System.out.println("		Total Due: " + fTotalPrice);
					break;
				case 2://happens if user enters 2
						System.out.println("		Purchase Price: " + fTotalPrice);
						System.out.println("		Discount Applied -" + fDiscountPrice + " (" + fPercent + " discount)");
						System.out.println("		Shipping: " + fShipping);
						System.out.println("-------------------------------------------------------------");
						System.out.println("		Total Due: " + fTotalPriceDiscount);
					break;
				case 3: //happens if user enters 3
						if (totalPrice < finalPriceDiscount) {
							System.out.println("		Purchase Price: " + fTotalPrice);
							System.out.println("		Discount Applied $-0.00");
							System.out.println("		Shipping: $0.00 FREE SHIPPING");
							System.out.println("-------------------------------------------------------------");
							System.out.println("		Total Due: " + fTotalPrice);
							}
							else {
								System.out.println("		Purchase Price: " + fTotalPrice);
								System.out.println("		Discount Applied -" + fDiscountPrice + " (" + fPercent + " discount)");
								System.out.println("		Shipping: " + fShipping);
								System.out.println("-------------------------------------------------------------");
								System.out.println("		Total Due: " + fTotalPriceDiscount);	
							}
					break;
						
			}//end switch
		
			System.out.println();
			System.out.println();
			System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
			System.out.println();
		
			input.nextLine(); //clear the input buffer
		
			System.out.println("Do you want to start over? Y/N: ");
		
			repeat = input.nextLine().toUpperCase().charAt(0);
			
			while (repeat != 'Y' && repeat != 'N') {
				for (int i = 0; i < screenClear; i++){ //clears screen
					System.out.println();
				}
				
				System.out.println("ERROR! Please enter a valid character...");
				System.out.println("Do you want to start over? Y/N: ");
				
				repeat = input.nextLine().toUpperCase().charAt(0);
			}
			
			if(repeat == 'N') {
				for (int i = 0; i < screenClear; i++){ //clears screen
					System.out.println();
				}
				
				System.out.println("Thanks again for using the TICKET PRICE CALCULATOR!");
			}
		
        }while(repeat == 'Y');//will repeat if it is equal to Y
	}//end main
}//end Class