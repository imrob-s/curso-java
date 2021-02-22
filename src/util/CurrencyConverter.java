package util;

public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static double dollar(double price, double quantity) {
		return price * quantity * IOF;
	}
	
}
