package lesson04.HomeWork.task01_03;

/* read number of HTTP Error (400, 401,402, ...) and write the name of this error 
 * (Declare enum HTTPError)
 */
public class appHttpError {
	public static void main(String[] args) {

		Error error1 = new Error(400);
		Error error2 = new Error(401);
		Error error3 = new Error(402);
		Error error4 = new Error(403);
		Error error5 = new Error(404);
		Error error6 = new Error(406);
		Error error7 = new Error(407);
		System.out.println(error1.cont());
		System.out.println(error2.cont());
		System.out.println(error3.cont());
		System.out.println(error4.cont());
		System.out.println(error5.cont());
		System.out.println(error6.cont());
		System.out.println(error7.cont());
	}

}
