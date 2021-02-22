package entities;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	public static final double TAX = 5.00;
	
	public Account() {
		
	}
	
	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double valor) {
		balance += valor;
	}
	
	public void withdraw(double valor) {
		balance -= valor + TAX;
	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
}
