package dip;

public class DebitCard implements BankCard {

	public void doTransaction(long amount) {
		System.out.print("Payment Using Debit Card :" + amount);
	}
}
