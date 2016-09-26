package in.ac.kletech.customer;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer[] c=new Customer[5];
		RegularCustomer reg1=new RegularCustomer(12, "abs", "123", 1241,0.5);
		RegularCustomer reg2=new RegularCustomer(13, "qwe", "1124", 2525, 0.5);
		RegularCustomer reg3=new RegularCustomer(14, "sdf", "1341", 2545, 0.5);
		PriviligedCustomer pri1=new PriviligedCustomer(15, "ef", "234", 3463, "Gold");
		
		c[0]=reg1;
		c[1]=reg2;
		c[2]=reg3;
		c[3]=pri1;
		for(int i=0;i<(c.length-1);i++)
		{
			c[i].computeBillAmt();
			c[i].printCustomerInfo();
		}
		c[4]=reg1;
		c[4].computeBillAmt();
		c[4].printCustomerInfo();
		
	}

}
