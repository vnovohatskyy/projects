package lesson01;
public class PricePhoneCallsCycle {
	PricePhoneCallsInput inputData=new PricePhoneCallsInput();
	double totalPrice;	
	
	public void cycle(){
		for (int count=0; count<3; count++){
		int country=count+1;
		System.out.println("Please, insert call time to country"+country);
		double time = inputData.input();
		System.out.println("Please, insert price of the call to country"+country+" per minute");
		double price= inputData.input();
		double priceCall=solvePriceCall(time, price);
		priceCall=round(priceCall);
		System.out.println("The price of the call to country"+country+" is "+priceCall);
		totalPrice = totalPrice + priceCall; 
		System.out.println();				
		}
		}
	
	public double solvePriceCall(double a, double b){
	    double s;
	    s=a*b;
	    return s;
	    }

	public double round(double a){
		int d;
		a=a*100;
		d=(int)Math.round(a);
		a=(double)d/100;
		return a;
	}
}


