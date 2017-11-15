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
	
	public CustomerOrder() {
		
	}
	
	/****GETTERS****/
	
	
	/****SETTERS****/
	
	/****METHODS****/
	
	
}