package project3;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*********************************************************************************** * 
------------------------------------------------------------------------------------ 
* 		 File name: Project4.java 
*        Project name: CSCI 1250 Project 4 
* ------------------------------------------------------------------------------------ 
*     Author Name: Ryan 
*     Author E-mail: shuper@etsu.edu 
*     Course-Section: CSCI-1250-004
*     Creation Date: 11/20/17 
*     Date of Last Modification: 11/29/17 
* ------------------------------------------------------------------------------------ */

public class Project4{
	
	public static void main(String[] args){
		CustomerOrder order1 = null;
		CustomerOrder order2 = null;
		CustomerOrder order3 = null;
		int mainChoice = 0;
		int subChoice = 0;
		int numOrders = 0;
		final int MAX_ORDERS = 3;
		String output = "";
		
		//Display the welcome message
		JOptionPane.showMessageDialog(null,"Welcome to the Customer Order"
			+ " System.  You may place up to 3 orders in our system.");
		
		
		do{
			//TO DO: call displayMenu to get the user's selection
	
			mainChoice = displayMenu(numOrders);
			
			switch(mainChoice){
				case 1: //TO DO: place a new order - you have three orders to work with.  Make sure
						//that when inputting the order information you put it in the appropriate
						//order object (order1, order2, or order 3)
						
						
						break;
				
				case 2: //TO DO: display all orders - if there are no orders, an appropriate message
						//should be displayed.  Otherwise, you should display all orders that have
						//actually been placed
						
						
						break;
				case 3: //TO DO: display a specific order - if there are no orders, an appropriate
						//message should be displayed.  Otherwise, you should display a submenu
						//of the orders that have been placed so the user can select which one
						//to display.  It should then display the appropriate order.
						
						
						break;
			}//end switch
		} while (mainChoice != 4);
		
	}
	
	public static int displayMenu(int numOrders)
	{
		int selection = 0;
		String input;
		
		String menu = "\n  CUSTOMER ORDER MENU"
					+ "\n -----------------------------------"
					+ "\n 1. Create a new order"
					+ "\n 2. Display all orders"
					+ "\n 3. Display a specific order"
					+ "\n 4. Place orders and Exit"
					+ "\n\n You currently have " + numOrders + " orders in the system."
					+ "\n\n Selection: ";
		
		while(selection > 4 && selection <=0) {
			input = JOptionPane.showInputDialog(menu);
			selection = Integer.parseInt(input);
		}
		return selection;
	}
	
	//TO DO: this method should display the orders available to view.  This would only be orders
	//that have been placed.  For ex, if only one order has been placed, only order1 should show
	//up in the submenu to be selected.  The customer name and the balance due should be shown 
	//For ex. -> 1. John Smith  Balance Due: $123.45
	//			 2. Jane Doe  Balance Due: $234.56
	//			 Selection: 
	//You should also do input validation to be sure that the user's selection is in fact a valid
	//selection from the submenu. Balance Due should be shown with a currency formatting (dollar sign
	//and two decimal places).  The purpose of this method is to get the user's selection from the
	//submenu and return it.
	public static int displaySubMenu (CustomerOrder order1, CustomerOrder order2, CustomerOrder order3,
									  int numOrders)
	{
		int selection=0;
		
		return selection;
	}
	
	//This method is written for you and complete.  You simply need to call it whenever a new order 
	//is being input. This method asks the user information about an order and creates an order
	//object that is then returned to the calling method to be stored in a variable there. All of
	//the code to get the info and create the object is in this method and does not need to be 
	//duplicated elsewhere.
	public static CustomerOrder inputOrder()
	{
		
		//I inadvertently left off the prompt in the skeleton program for the customer number.  
		//So, you will need to go to the inputOrder method and add the prompt for that.  
		//Just follow the example of how everything else is being prompted for and passed to the setter.
		CustomerOrder temp = new CustomerOrder();
		
		temp.setCustomerName
				(JOptionPane.showInputDialog("Enter your name:"));
		temp.setPhoneNum
				(JOptionPane.showInputDialog("Enter your phone number:"));
		temp.setNumWidgets
				(Integer.parseInt
				  (JOptionPane.showInputDialog("How many widgets do you want to purchase?")));
		temp.setNumGadgets
				(Integer.parseInt
				  (JOptionPane.showInputDialog("How many gadgets do you want to purchase?")));
		temp.setTaxCode
				(JOptionPane.showInputDialog
				  ("Are you tax exempt? \nEnter T for Taxable, N for Non-Taxable")
				  .toUpperCase().charAt(0));
		temp.setShippingCode
				(JOptionPane.showInputDialog
				  ("What type of shipping do you prefer? \nS - Standard, P - Priority, O - Overnight")
				  .toUpperCase().charAt(0));
		temp.setDiscountCode
				(Integer.parseInt(JOptionPane.showInputDialog
				  ("Do you qualify for a discount? \n0 - No discount, 1 - Loyalty, 2 - Employee")));
		
		return temp;
	}
}