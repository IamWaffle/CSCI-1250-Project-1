import java.util.Scanner;

public class Project1 {
	public static void main(String[] args){
		
		final double priceAdult; //declare variables	
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
		
		System.out.println ("******WELCOME TO THE TICKET PRICE CALCULATOR******"); //introduction screen
		System.out.println ("              Created by: Ryan Shupe              ");
		System.out.println();
		System.out.println();
		System.out.println("              --Press ENTER to Coninue--           ");
		input.nextLine();
		
		System.out.print("How many adult tickets do you wish to purchase?");
		numAdult = input.nextInt(); //gets number of adult tickets
		
		System.out.print("How many student/senior tickets do you wish to purchase?");
		numOther = input.nextInt(); //gets number of other tickets

		System.out.println(); //clear screen
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
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
		
		System.out.println(); //clear screen
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();			

		
		
		totalPriceAdult = priceAdult * numAdult; //calculates price for the Adult tickets
		totalPriceOther = priceOther * numOther; //calculates price for the Other tickets
		
		totalPriceTicket = totalPriceOther + totalPriceAdult; //calulates total price of all the tickets
		
		discountPrice = discount * totalPriceTicket; //calculates total discount price
		
		totalPriceTicket2 = totalPriceTicket - discount + shipping; 	//calculates price with discount and shipping

		
		switch (option) {
			case 1: //happens if user enters 1
					System.out.println("		Purchase Price: $" + totalPriceTicket);
					System.out.println("		Discount Applied $-0.00");
					System.out.println("		Shipping: $0.00 FREE SHIPPING");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + totalPriceTicket);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 2://happens if user enters 2
					System.out.println("		Purchase Price: $" + totalPriceTicket);
					System.out.println("		Discount Applied -$" + discountPrice + " (10% discount)");
					System.out.println("		Shipping: +$5.00");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + totalPriceTicket2);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 3: //happens if user enters 3
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
					System.out.println("Sorry, that ws not a valid option. We will apply"); //used if use enters something other than 1-3
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
		}//end switch
	}//end main
}//end Class