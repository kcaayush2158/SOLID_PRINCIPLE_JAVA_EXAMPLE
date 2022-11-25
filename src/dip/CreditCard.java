package dip;

public class CreditCard implements BankCard {
	
	public void doTransaction(long amount) {
		System.out.print("Payment Using Credit Card :" + amount);
	}

}
