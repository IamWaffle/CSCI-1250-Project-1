package project1;

import java.util.Scanner;


public class Project1 {
	public static void main(String[] args){
		
		final double priceAdult;
		final double priceOther;
		
		int option;
		int numAdult;
		int numOther;
		
		double totalPriceTicket;	
		double totalPriceTicket2;
		double totalPriceAdult;
		double totalPriceOther;
		
		
		final double discount;
		final double shipping;
		
		double discountPrice;
		
		priceAdult = 10;
		priceOther = 5;
		
		discount = .10;
		shipping = 5.00;

		
		Scanner input = new Scanner(System.in); 
		
		System.out.println ("******WELCOME TO THE TICKET PRICE CALCULATOR******");
		System.out.println ("              Created by: Ryan Shupe              ");
		System.out.println();
		System.out.println();
		System.out.println("              --Press ENTER to Coninue--           ");
		input.nextLine();
		
		System.out.print("How many adult tickets do you wish to purchase?");
		numAdult = input.nextInt();
		
		System.out.print("How many student/senior tickets do you wish to purchase?");
		numOther = input.nextInt();
		
		System.out.println ("Please make a selection from the menu options below for additional savings");
		System.out.println();
		System.out.println ("              Savings Menu               ");
		System.out.println ("             --------------              ");
		System.out.println ("          1. Free Shipping               ");
		System.out.println ("          2. 10.0% discount              ");
		System.out.println ("          3. Apply whichever disvount will save me the most money");
		System.out.println();
		System.out.print("           Enter your selection: ");
		option = input.nextInt();
		
		
		totalPriceAdult = priceAdult * numAdult;
		totalPriceOther = priceOther * numOther;
		
		totalPriceTicket = totalPriceOther + totalPriceAdult;
		
		discountPrice = discount * totalPriceTicket;
		
		totalPriceTicket2 = totalPriceTicket - discount + shipping; 	

		
		switch (option) {
			case 1:
					System.out.println("		Purchase Price: $" + totalPriceTicket);
					System.out.println("		Discount Applied $-0.00");
					System.out.println("		Shipping: $0.00 FREE SHIPPING");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + totalPriceTicket);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 2:
					System.out.println("		Purchase Price: $" + totalPriceTicket);
					System.out.println("		Discount Applied -$" + discountPrice + " (10% discount)");
					System.out.println("		Shipping: +$5.00");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + totalPriceTicket2);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 3:
					if (totalPriceTicket < totalPriceTicket2) {
						System.out.println("		Purchase Price: $" + totalPriceTicket);
						System.out.println("		Discount Applied $-0.00");
						System.out.println("		Shipping: $0.00 FREE SHIPPING");
						System.out.println("-------------------------------------------------------------");
						System.out.println("		Total Due $" + totalPriceTicket);
						System.out.println();
						System.out.println();
						System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
					}
					
					if (totalPriceTicket2 < totalPriceTicket) {
						System.out.println("		Purchase Price: $" + totalPriceTicket);
						System.out.println("		Discount Applied -$" + discountPrice + " (10% discount)");
						System.out.println("		Shipping: +$5.00");
						System.out.println("-------------------------------------------------------------");
						System.out.println("		Total Due $" + totalPriceTicket2);
						System.out.println();
						System.out.println();
						System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
					}
				break;
			
			default:
					System.out.println("Sorry, that ws not a valid option. We will apply");
					System.out.println("free shipping to save you a total of $" + shipping);
					System.out.println();
					System.out.println();
					System.out.println("		Purchase Price: $" + totalPriceTicket);
					System.out.println("		Discount Applied $-0.00");
					System.out.println("		Shipping: $0.00 FREE SHIPPING");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + totalPriceTicket);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
		}
		
		

	}
}