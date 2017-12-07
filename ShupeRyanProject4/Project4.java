import javax.swing.JOptionPane;


/*********************************************************************************** * 
------------------------------------------------------------------------------------ 
* 		 File name: Project4.java 
*        Project name: CSCI 1250 Project 4 
* ------------------------------------------------------------------------------------ 
*     Author Name: Ryan 
*     Author E-mail: shuper@etsu.edu 
*     Course-Section: CSCI-1250-004
*     Creation Date: 11/20/17 
*     Date of Last Modification: 12/06/17 
* ------------------------------------------------------------------------------------ */

/*********************************************************************************** 
 * Class Name: Project4 <br> 
 *  Class Purpose: Project 4 <br> 
 *  
 *   <hr> 
 *   Date created: 12/07/17 <br> 
 *   Date last modified: 12/07/17 
 *   @author Ryan Shupe */

public class Project4{
	
	/******************************************************************************** 
	* Method Name: main <br> 
	* Method Purpose:  Driver method for the entire program. Initialize variables, call methods    
	*      <br> 
	* 
	* <hr> 
	* Date created: 12/07/17 <br> 
	* Date last modified: 12/07/17 <br> 
	* 
	* <hr> 
	* 
	*  
	*  
	*@param args  Command Line Arguments 
	* <hr> 
	*/
	
	public static void main(String[] args){
		CustomerOrder order1 = null;			//order 1 
		CustomerOrder order2 = null;			//order 2
		CustomerOrder order3 = null;			//order 3
		
		int mainChoice = 0;						//number chosen at the displayMenu()
		int subChoice = 0;						//number chosen at the displaySubMenu()
		int numOrders = 0;						//number of orders in the system
		String output = "";						//string for output
		
		//Display the welcome message
		JOptionPane.showMessageDialog(null,"Welcome to the Customer Order"
			+ " System.  You may place up to 3 orders in our system.");
		
		do{
		
			mainChoice = displayMenu(numOrders);
			
			switch(mainChoice){

				case 1:
					
					if (numOrders == 0 ) {
						order1 = inputOrder();
						numOrders = 1;
					}
					else if(numOrders == 1 ) {
						order2 = inputOrder();
						numOrders = 2;
					}
					else {
						order3 = inputOrder();
						numOrders = 3;
					}
	
						break;
				
				case 2: 
				
					if(numOrders == 0 ) {
						JOptionPane.showMessageDialog(null, "There are no orders in the system.");
					}
					else if (numOrders == 1){
						output = order1.toString();
						JOptionPane.showMessageDialog(null, output);
					}
					else if (numOrders == 2) {
						output = order1.toString() + order2.toString();
						JOptionPane.showMessageDialog(null, output);
					}
					else {
						output = order1.toString() + order2.toString() + order3.toString();
						JOptionPane.showMessageDialog(null, output);
					}
						break;
						
				case 3: 
						
					if(numOrders == 0 ) {
						JOptionPane.showMessageDialog(null, "There are no orders in the system.");
					}
					
					else if(numOrders == 1) {
						subChoice = displaySubMenu(order1, null, null, numOrders);
					}
					
					else if(numOrders == 2) {
						subChoice = displaySubMenu(order1, order2, null, numOrders);
					}
					else if(numOrders == 3) {
						subChoice = displaySubMenu(order1, order2, order3, numOrders);
					}
					
					
					if(subChoice == 1) {
						JOptionPane.showMessageDialog(null, order1);
					}
					else if (subChoice == 2) {
						JOptionPane.showMessageDialog(null, order2);
					}
					else {
						JOptionPane.showMessageDialog(null, order3);
					}
	
						break;
			}//end switch
		} while (mainChoice != 4);
		
	}
	
	/******************************************************************************** 
	* Method Name: displayMenu <br> 
	* Method Purpose:  Display a menu with options to choose from. Has input validation where you can only choose a 1 2 3 or 4.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 12/07/17 <br> 
	* Date last modified: 12/07/17 <br> 
	* 
	* <hr> 
	* 
	*  
	*  
	*@param numOrders int
	*@return selection
	* <hr> 
	*/
	
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
		
		input = JOptionPane.showInputDialog(menu);
		selection = Integer.parseInt(input);
		
		while(selection > 4 && selection < 0) {
			input = JOptionPane.showInputDialog(menu);
			selection = Integer.parseInt(input);
		}
		return selection;
	}
	
	/******************************************************************************** 
	* Method Name: displaySubMenu <br> 
	* Method Purpose:  Display a sub menu showing the orders that are currently in the 'system' and shows details of that order.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 12/07/17 <br> 
	* Date last modified: 12/07/17 <br> 
	* 
	* <hr> 
	* 
	*  
	*  
	*@param order1 CustomerOrder
	*@param order2 CustomerOrder
	*@param order3 CustomerOrder
	*@param numOrders int
	*@return selection
	* <hr> 
	*/
	
	public static int displaySubMenu (CustomerOrder order1, CustomerOrder order2, CustomerOrder order3,
									  int numOrders)
	{
		int selection = 0;
		String input;
		
		String menu = "";
		
		if(numOrders == 1) {
			
			   menu = ("    Orders   \n"
	  			     + "---------------\n"
					 + "1: " + order1.getCustomerName() + " Balance Due: " + order1.format(order1.TotalDue())
					 );
			   
				input = JOptionPane.showInputDialog(menu);
				selection = Integer.parseInt(input);
				
				while(selection >= 2 && selection <= 0) {
					input = JOptionPane.showInputDialog(menu);
					selection = Integer.parseInt(input);
				}}
				
			else if(numOrders == 2) {
					
				   menu = ("    Orders   \n"
			  		     + "---------------\n"
						 + "1: " + order1.getCustomerName() + " Balance Due: " + order1.format(order1.TotalDue())
						 + "\n2: " + order2.getCustomerName() + " Balance Due: " + order2.format(order2.TotalDue())
						 );
					   
					input = JOptionPane.showInputDialog(menu);
					selection = Integer.parseInt(input);
						
					while(selection >= 3 && selection <= 0) {
						input = JOptionPane.showInputDialog(menu);
						selection = Integer.parseInt(input);
					}}
			else {
				
				   menu = ("    Orders   \n"
			  		     + "---------------\n"
						 + "1: " + order1.getCustomerName() + " Balance Due: " + order1.format(order1.TotalDue())
						 + "\n2: " + order2.getCustomerName() + " Balance Due: " + order2.format(order2.TotalDue())
						 + "\n3: " + order3.getCustomerName() + " Balance Due: " + order3.format(order3.TotalDue())
						 );
					   
					input = JOptionPane.showInputDialog(menu);
					selection = Integer.parseInt(input);
						
					while(selection >= 4 && selection <= 0) {
						input = JOptionPane.showInputDialog(menu);
						selection = Integer.parseInt(input);
					}}					
		return selection;
	}
	
	/******************************************************************************** 
	* Method Name: inputOrder <br> 
	* Method Purpose:  Shows multiple windows asking for attributes of a Customer Order object.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 12/07/17 <br> 
	* Date last modified: 12/07/17 <br> 
	* 
	* <hr> 
	* 
	*  
	*  
	*
	*@return temp
	* <hr> 
	*/
	public static CustomerOrder inputOrder()
	{
		CustomerOrder temp = new CustomerOrder();
		
		temp.setCustomerNumber(JOptionPane.showInputDialog("Enter customer number: "));
		
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