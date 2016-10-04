package lesson01;

import java.io.IOException;

public class PricePhoneCalls {
	/* Create console application. In method main() write code for solving next tasks:
	 * Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
	 * Talks continued t1, t2 and t3 minutes. How much computer will count for each call 
	 * separately and all talk together? Input all source data from console, make calculations
	 * and output to the screen.
	*/
	public static void main(String[] args) throws IOException {
		
		PricePhoneCallsCycle pricePhoneCallsCycle=new PricePhoneCallsCycle();
		pricePhoneCallsCycle.cycle();
		System.out.println("The total price of all calls are: "+pricePhoneCallsCycle.totalPrice);
		
		
	}
}