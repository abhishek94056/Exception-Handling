package tryCatchFinally;
import java.util.Scanner;
public class Application2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
				
		try {
			int n = s.nextInt();
			System.out.println("Square of given number is: ");
			System.out.println(n*n);
		} 
		catch(Exception e) {
			System.out.println("Enter only numeric value");
		}
		finally {
			System.out.println("Thanks for try to executing me..!");
		}
	}

}
