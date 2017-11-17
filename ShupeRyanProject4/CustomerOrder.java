
/*********************************************************************************** * 
------------------------------------------------------------------------------------ 
* 		 File name: CustomerOrder.java 
*        Project name: CSCI 1250 Project 4a 
* ------------------------------------------------------------------------------------ 
*     Author Name: Ryan 
*     Author E-mail: shuper@etsu.edu 
*     Course-Section: CSCI-1250-004
*     Creation Date: 11/14/17 
*     Date of Last Modification: 11/16/17 
* ------------------------------------------------------------------------------------ */

import java.text.DecimalFormat;

public class CustomerOrder{
	
	final private double COST_GADGET = 5.00;          //Cost of a gadget CONSTANT
	final private double COST_WIDGET = 10.00;        //Cost of a Widget CONSTANT
	final private double CHARGE_O = 20.00;           //Charge for Overnight shipping CONSTANT
	final private double CHARGE_P = 15.00;			 //Charge for Priority shipping CONSTANT
	final private double CHARGE_S = 10.00;			 //Charge for Standard shipping CONSTANT
	final private double TAX_RATE = 0.075;			 //Tax Rate CONSTANT
	final private double DISCOUNT_LOYALTY = 0.10;	 //Discount for loyalty CONSTANT
	final private double DISCOUNT_EMPLOYEE = 0.25;	 //Discount for employee's CONSTANT
	
	private String customerNumber = "";				 //Customer number String
	private String customerName = "";				 //Customer name String
	private String phoneNum = "";					 //Customer phone number String
	
	private int numGadgets;							 //Number of Gadgets
	private int numWidgets;							 //Number of Widgets
	
	private char taxCode;							 //Tax Code - T or N 
	private char shippingCode;						 //Shipping Code O, P, S
	private int discountCode;						 //Discount Code 0, 1, 2 
	
	/****CONSTRUCTORS****/
	
	//no arg Constructor
	public CustomerOrder() {
		
	}
	
	//arg Constructor
	public CustomerOrder(String cName, String cNum, String pNum, int numG, int numW, char tCode, char sCode, int dCode) {
		customerNumber = cNum;
		customerName = cName;
		phoneNum = pNum;
		numGadgets = numG;
		numWidgets = numW;
		taxCode = tCode;
		shippingCode = sCode;
		discountCode = dCode;
	}
	
	//copy Constructor
	public CustomerOrder(CustomerOrder original) {
		customerNumber = original.customerNumber;
		customerName = original.customerName;
		phoneNum = original.phoneNum;
		numGadgets = original.numGadgets;
		numWidgets = original.numWidgets;
		taxCode = original.taxCode;
		shippingCode = original.shippingCode;
		discountCode = original.discountCode;
	}
	
	/****SETTERS****/
	
	/******************************************************************************** 
	* Method Name: setCustomerNumber <br> 
	* Method Purpose:  Sets the customer number  
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setCustomerNumber(String num) {
		customerNumber = num;
	}
	
	/******************************************************************************** 
	* Method Name: setCustomerName <br> 
	* Method Purpose:  Sets the customer name    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setCustomerName(String num) {
		customerName = num;
	}
	
	/******************************************************************************** 
	* Method Name: setPhoneNum <br> 
	* Method Purpose:  Sets the phone number    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setPhoneNum(String num) {
		phoneNum = num;
	}
	
	/******************************************************************************** 
	* Method Name: setNumGadgets <br> 
	* Method Purpose:  Sets the number of gadgets to a user entered value    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setNumGadgets(int num) {
		if (num > 0) {
			numGadgets = num;
		}
		else {
			numGadgets = 0;
		}
	}
	
	/******************************************************************************** 
	* Method Name: setNumWidgets <br> 
	* Method Purpose:  Sets the number of widgets to a user entered value    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setNumWidgets(int num) {
		if (num > 0) {
			numWidgets = num;
		}
		else {
			numWidgets = 0;
		}
	}
	
	/******************************************************************************** 
	* Method Name: setTaxCode <br> 
	* Method Purpose:  Sets the tax code or an N or a T    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setTaxCode(char c) {
		if (c == 'N') {
			taxCode = c;
		} 
		else {
			taxCode = 'T';
		}
	}
	
	/******************************************************************************** 
	* Method Name: setShippingCode <br> 
	* Method Purpose:  Sets the discount code to a O, P or S    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setShippingCode(char c) {
		if (c == 'O' || c == 'P') {
			shippingCode = c;
		} 
		else {
			shippingCode = 'S';
		}
	}
	
	/******************************************************************************** 
	* Method Name: setDiscountCode <br> 
	* Method Purpose:  Sets the discount code to a 0, 1 or 2    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* <hr> 
	*/
	
	public void setDiscountCode(int num) {
		if (num == 1 || num == 2) {
			discountCode = num;
		} 
		else {
			discountCode = 0;
		}
	}
	
	/****GETTERS*/
	 
	/******************************************************************************** 
	* Method Name: getCustomerNum <br> 
	* Method Purpose:  Return the customer number     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return customerNumber<hr> 
	*/
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	/******************************************************************************** 
	* Method Name: getCustomerName <br> 
	* Method Purpose:  Return the customer name     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return customerName<hr> 
	*/
	
	public String getCustomerName() {
		return customerName;
	}
	
	/******************************************************************************** 
	* Method Name: getPhoneNum <br> 
	* Method Purpose:  Return the phone number     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return phoneNum<hr> 
	*/
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	/******************************************************************************** 
	* Method Name: getnumGadgets <br> 
	* Method Purpose:  Return the number of gadgets     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return numGadgets<hr> 
	*/
	
	public int getNumGadgets() {
		return numGadgets;
	}
	
	/******************************************************************************** 
	* Method Name: getnumWidgets <br> 
	* Method Purpose:  Return the number of widgets     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return numWidgets<hr> 
	*/
	
	public int getNumWidgets() {
		return numWidgets;
	}
	
	/******************************************************************************** 
	* Method Name: getTaxCode <br> 
	* Method Purpose:  Return the tax code     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return taxCode<hr> 
	*/
	
	public char getTaxCode() {
		return taxCode;
	}
	
	/******************************************************************************** 
	* Method Name: getShippingCode <br> 
	* Method Purpose:  Return the shipping code     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return shippingCode<hr> 
	*/
	
	public char getShippingCode() {
		return shippingCode;
	}
	
	/******************************************************************************** 
	* Method Name: getDiscountCode <br> 
	* Method Purpose:  Return the discount code     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return discountCode<hr> 
	*/
	
	public int getDiscountCode() {
		return discountCode;
	}
	
	/****METHODS****/
	
	/******************************************************************************** 
	* Method Name: toString <br> 
	* Method Purpose:  Return the order information formatted into one string     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return output<hr> 
	*/
	
	public String toString() {
		String output = null;
		
		return output;
	}
	
	/******************************************************************************** 
	* Method Name: equals <br> 
	* Method Purpose:   Return a boolean value indicating whether or not the current object is equal to the object passed in 
	*                   (determined by comparing all class attributes)     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return tf<hr> 
	*/
	
	public boolean equals(CustomerOrder original) {
		boolean tf;
		
		if(customerNumber == original.customerNumber &&
		   customerName == original.customerName &&
		   phoneNum == original.phoneNum &&
		   numGadgets == original.numGadgets &&
		   numWidgets == original.numWidgets &&
		   taxCode == original.taxCode &&
		   shippingCode == original.shippingCode &&
		   discountCode == original.discountCode) 
		{
			tf = true;
		}
		else {
			tf = false;
		}
		
		return tf;
	}
	
	/******************************************************************************** 
	* Method Name: translateTaxCode <br> 
	* Method Purpose:  Based on the tax code stored, it should return “Taxable” or “NonTaxable”     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return translatedString<hr> 
	*/
	
	public String translateTaxCode() {
		String translatedString;
		
		if(getTaxCode() == 'T') {
			translatedString = "Taxable";
		}
		else {
			translatedString = "Non-Taxable";
		}
		
		return translatedString;
	}
	
	/******************************************************************************** 
	* Method Name: translateShippingCode <br> 
	* Method Purpose:  Based on the shipping code stored, it should return “Priority”, “Overnight” or “Standard”     
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return translatedString<hr> 
	*/
	
	public String translateShippingCode() {
		String translatedString;
		
		if(getShippingCode() == 'P') {
			translatedString = "Priority";
		}
		else if (getShippingCode() == 'O') {
			translatedString = "Overnight";
		}
		else{
			translatedString = "Standard";
		}
		
		return translatedString;
	}
	
	/******************************************************************************** 
	* Method Name: translateDiscountCode <br> 
	* Method Purpose:  Based on the discount code stored, it should return “Loyalty”, “Employee”  or “No Discount”    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return translatedString<hr> 
	*/
	
	public String translateDiscountCode() {
		String translatedString;
		
		if(getDiscountCode() == 0) {
			translatedString = "No Discount";
		}
		else if (getDiscountCode() == 1) {
			translatedString = "Loyalty";
		}
		else{
			translatedString = "Employee";
		}
		
		return translatedString;
	}
	
	/******************************************************************************** 
	* Method Name: calcItemTotal <br> 
	* Method Purpose: Calculate and return the total cost of the gadgets and widgets without anything else added in (no shipping, tax, discounts, etc)   
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return itemTotal<hr> 
	*/
	
	public double calcItemTotal() {
		double itemTotal;
		
		itemTotal = (getNumGadgets() * COST_GADGET) + (getNumWidgets() * COST_WIDGET);
		
		return itemTotal;		
	}
	
	/******************************************************************************** 
	* Method Name: calcDiscount <br> 
	* Method Purpose:  Calculate and return the appropriate amount of discount based on the item total (without tax or shipping added in)   
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return discount<hr> 
	*/
	
	public double calcDiscount() {
		double discount;
		
		if(getDiscountCode() == 1) {
			discount = calcItemTotal() * DISCOUNT_LOYALTY;
		}
		else if (getDiscountCode() == 2) {
			discount = calcItemTotal() * DISCOUNT_EMPLOYEE;
		}
		else {
			discount = 0.00;
		}
		
		return discount;
	}
	
	/******************************************************************************** 
	* Method Name: calcTax <br> 
	* Method Purpose:  Calculate and return the amount of tax based on the item total including any discounts   
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return tax<hr> 
	*/ 
	
	public double calcTax() {
		double tax;
		
		tax = (calcItemTotal() - calcDiscount()) * TAX_RATE;
		
		return tax;
	}
	
	/******************************************************************************** 
	* Method Name: calcShipping <br> 
	* Method Purpose:  Determine and return the appropriate shipping amount    
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return shipping<hr> 
	*/ 
	
	public double calcShipping() {
		double shipping;
		
		if(getShippingCode() == 'O') {
			shipping = CHARGE_O;
		}
		else if (getShippingCode() == 'P') {
			shipping = CHARGE_P;
		}
		else {
			shipping = CHARGE_S;
		}
		
		return shipping;
	}
	
	/******************************************************************************** 
	* Method Name: totalDue <br> 
	* Method Purpose: Calculate and return the total due, including the item cost, discount, tax and shipping   
	*      <br> 
	* 
	* <hr> 
	* Date created: 11/16/17 <br> 
	* Date last modified: 11/16/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return total<hr> 
	*/ 
	
	public double TotalDue() {
		double total;
		
		total = calcItemTotal() - calcDiscount() + calcTax() - calcShipping();
		
		return total;
	}
}