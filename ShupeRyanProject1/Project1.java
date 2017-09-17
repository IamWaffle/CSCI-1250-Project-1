import java.util.Scanner;
import java.text.DecimalFormat;

public class Project1 {
	public static void main(String[] args){
		
		final double priceAdult; //declare variables	
		final double priceOther;
		final double shipping;
		
		final float discount;

		double totalPriceAdult;
		double totalPriceOther;
		double totalPrice;	
		double finalPriceDiscount;
		double discountPrice;
		
		int option;
		int numAdult;
		int numOther;
		int screenClear;
		

		priceAdult = 10.00;
		priceOther = 5.00;
		
		discount = .10f;
		shipping = 5.00;
				
		screenClear = 23;
		
		Scanner input = new Scanner(System.in); 
		
        DecimalFormat formatCash = new DecimalFormat("0.00");
        DecimalFormat formatPerc = new DecimalFormat("00.0%");
		
        String fShipping = formatCash.format(shipping);
        String fPercent = formatPerc.format(discount);
		
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
		input.close();

		for (int i = 0; i < screenClear; i++){ //clears screen
			System.out.println();
		}

		totalPriceAdult = priceAdult * numAdult; //calculates price for the Adult tickets
		totalPriceOther = priceOther * numOther; //calculates price for the Other tickets
		
		totalPrice = totalPriceOther + totalPriceAdult; //calculates total price of all the tickets
		
		discountPrice = discount * totalPrice; //calculates total discount price
		
		finalPriceDiscount = totalPrice - discountPrice + shipping; 	//calculates price with discount and shipping
		
        String fTotalPrice = formatCash.format(totalPrice);
        String fTotalPriceDiscount = formatCash.format(finalPriceDiscount);
        String fDiscountPrice = formatCash.format(discountPrice);

		switch (option) {
			case 1: //happens if user enters 1
					System.out.println("		Purchase Price: $" + fTotalPrice);
					System.out.println("		Discount Applied $-0.00");
					System.out.println("		Shipping: $0.00 FREE SHIPPING");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + fTotalPrice);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 2://happens if user enters 2
					System.out.println("		Purchase Price: $" + fTotalPrice);
					System.out.println("		Discount Applied -$" + fDiscountPrice + " (" + fPercent + " discount)");
					System.out.println("		Shipping: $" + fShipping);
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + fTotalPriceDiscount);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;
			case 3: //happens if user enters 3
					if (totalPrice < finalPriceDiscount) {
						System.out.println("		Purchase Price: $" + fTotalPrice);
						System.out.println("		Discount Applied $-0.00");
						System.out.println("		Shipping: $0.00 FREE SHIPPING");
						System.out.println("-------------------------------------------------------------");
						System.out.println("		Total Due $" + fTotalPrice);
						System.out.println();
						System.out.println();
						System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
						}
						else {
							System.out.println("		Purchase Price: $" + fTotalPrice);
							System.out.println("		Discount Applied -$" + fDiscountPrice + " (" + fPercent + " discount)");
							System.out.println("		Shipping: $" + fShipping);
							System.out.println("-------------------------------------------------------------");
							System.out.println("		Total Due $" + fTotalPriceDiscount);
							System.out.println();
							System.out.println();
							System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
							
						}
				break;
					
			default:
					System.out.println("Sorry, that was not a valid option. We will apply"); //used if use enters something other than 1-3
					System.out.println("free shipping to save you a total of $" + shipping);
					System.out.println();
					System.out.println();
					System.out.println("		Purchase Price: $" + fTotalPrice);
					System.out.println("		Discount Applied $-0.00");
					System.out.println("		Shipping: $0.00 FREE SHIPPING");
					System.out.println("-------------------------------------------------------------");
					System.out.println("		Total Due $" + fTotalPrice);
					System.out.println();
					System.out.println();
					System.out.println("******Thank you for using THE TICKET PRICE CALCULATOR******");
				break;

		}//end switch
	}//end main
}//end Class