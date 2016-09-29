package lesson01;
import java.util.Scanner;
public class FlowerBed {
	/*Create console application. In method main() write code for solving next tasks:
	 * Flower bed is shaped like a circle. Calculate the perimeter and area by entering the 
	 * radius. Output obtained results.
	 */
	static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Enter the radius: ");
	        
		    double radius = sc.nextDouble();
		    
		    double area=circleArea(radius);
		    System.out.println("Flower bed (circle) area is "+area);
		    
		    double perimeter=circlePerimeter(radius);
		    System.out.println("Flower bed (circle) perimeter is "+perimeter);
			}
		    
			public static double circleArea(double a){
		    double s;
		    s=Math.PI*(a*a);
		    return s;
		    }
		    
			public static double circlePerimeter(double a){
			double s;
			s=2*Math.PI*a;
			return s;
	        }

}
