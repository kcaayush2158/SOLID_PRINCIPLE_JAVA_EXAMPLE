package dip;

public class ShoppingMall {
	
	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doSomething(long amount) {
		this.bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		
		BankCard bankCard = new DebitCard();
		ShoppingMall shoppingMall =new ShoppingMall(bankCard);
		shoppingMall.doSomething(2000);
	}
	

}
