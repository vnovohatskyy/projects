package lesson01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PricePhoneCalls {
	/* Create console application. In method main() write code for solving next tasks:
	 * Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
	 * Talks continued t1, t2 and t3 minutes. How much computer will count for each call 
	 * separately and all talk together? Input all source data from console, make calculations
	 * and output to the screen.
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));
		
		
		System.out.println("Please, insert call time to country 1");
		double callTime1 = Double.parseDouble(br.readLine());
		System.out.println("Please, insert price of the call to country 1 per minute");
		double priñePerMinute1=Double.parseDouble(br.readLine());
		double price1=priceCountry(callTime1, priñePerMinute1);
		System.out.println("The price of the call to country 1 is "+price1);
		
		
		System.out.println("Please, insert call time to country 2");
		double callTime2 = Double.parseDouble(br.readLine());
		System.out.println("Please, insert price of the call to country 2 per minute");
		double priñePerMinute2=Double.parseDouble(br.readLine());
		double price2=priceCountry(callTime2, priñePerMinute2);
		System.out.println("The price of the call to country 2 is "+price2);

		System.out.println("Please, insert call time to country 3");
		double callTime3 = Double.parseDouble(br.readLine());
		System.out.println("Please, insert price of the call to country 3 per minute");
		double priñePerMinute3=Double.parseDouble(br.readLine());
		double price3=priceCountry(callTime3, priñePerMinute3);
		System.out.println("The price of the call to country 3 is "+price3);
		
		double totPr=totalPrice(price1, price2, price3);
		System.out.println("Total price of calls to all countries are "+totPr);
	}
	
	public static double priceCountry(double callTime, double priñePerMinute){
	    double s;
	    s=priñePerMinute*callTime;
	    return s;
	    }
	
	public static double totalPrice(double price1, double price2, double price3){
	    double s;
	    s=price1+price2+price3;
	    return s;
	}

}
