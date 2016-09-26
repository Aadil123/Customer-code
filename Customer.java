package in.ac.kletech.customer;

abstract class Customer {
	int iCustomerID;
	String sCustomername;
	String sPhoneNum;
	float fBillAmount;
	public Customer(int iCustomerID, String sCustomername, String sPhoneNum, float fBillAmount) {
		this.iCustomerID = iCustomerID;
		this.sCustomername = sCustomername;
		this.sPhoneNum = sPhoneNum;
		this.fBillAmount = fBillAmount;
	}
	
	void printCustomerInfo()
	{
		System.out.println("Illegal operation performed");
	}
	public String toString()
	{
		return "Name: "+sCustomername+"	ID: "+iCustomerID+"	Ph no: "+sPhoneNum+"	Bill: Rs."+fBillAmount;
	}
	abstract void computeBillAmt();
}


class RegularCustomer extends Customer{
	double discount;
	public RegularCustomer(int iCustomerID, String sCustomername, String sPhoneNum, float fBillAmount,double discount) {
		super(iCustomerID, sCustomername, sPhoneNum, fBillAmount);
		this.discount=discount;
	}
	
	void computeBillAmt() {
		this.discount=0.5f*this.fBillAmount;
		this.fBillAmount=(float) (this.fBillAmount-(this.discount));
		
	}
	void printCustomerInfo()
	{
		this.toString();
	}
	
}
class PriviligedCustomer extends Customer{
	String memberCardtype;
	public PriviligedCustomer(int iCustomerID, String sCustomername, String sPhoneNum, float fBillAmount, String memberCardType ) {
		super(iCustomerID, sCustomername, sPhoneNum, fBillAmount);
		this.memberCardtype=memberCardType;
	}
	
	void computeBillAmt() {
		if(this.memberCardtype=="Gold")
			this.fBillAmount=this.fBillAmount-(0.1f*this.fBillAmount);
		else if(this.memberCardtype=="Gold Premium")
			this.fBillAmount=this.fBillAmount-(0.15f*this.fBillAmount);
		
	}

	void printCustomerInfo()
	{
		this.toString();
	}
}