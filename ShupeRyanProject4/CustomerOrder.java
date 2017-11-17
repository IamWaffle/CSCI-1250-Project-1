import java.text.DecimalFormat;

public class CustomerOrder{
	
	final private double COST_GAGET = 5.00;          //Cost of a gadget CONSTANT
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
	
	public void setCustomerNumber(String num) {
		customerNumber = num;
	}
	
	public void setCustomerName(String num) {
		customerName = num;
	}
	
	public void setPhoneNum(String num) {
		phoneNum = num;
	}
	
	public void setNumGadgets(int num) {
		numGadgets = num;
	}
	
	public void setNumWidgets(int num) {
		numWidgets = num;
	}
	
	public void setTaxCode(char c) {
		if (c == 'N') {
			taxCode = c;
		} 
		else {
			taxCode = 'T';
		}
	}
	
	public void setShippingCode(char c) {
		if (c == 'O' || c == 'P') {
			shippingCode = c;
		} 
		else {
			shippingCode = 'S';
		}
	}
	
	public void setDiscountCode(int num) {
		if (num == 1 || num == 2) {
			discountCode = num;
		} 
		else {
			discountCode = 0;
		}
	}
	
	/****GETTERS
	 * @return ****/
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public int getNumGadgets() {
		return numGadgets;
	}
	
	public int getNumWidgets() {
		return numWidgets;
	}
	
	public char getTaxCode() {
		return taxCode;
	}
	
	public char getShippingCode() {
		return shippingCode;
	}
	
	public int getDiscountCode() {
		return discountCode;
	}
	
	/****METHODS****/
	
	public String toString() {
		String output = null;
		
		return output;
	}
	
	public boolean equals() {
		boolean tf = false;
		return tf;
		
	}
	
	
}