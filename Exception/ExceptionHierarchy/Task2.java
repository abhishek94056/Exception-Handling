package ExceptionHierarchy;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task2 {
	//2. WAP to accept 2 numbers and the operation from the user. 
	//If the operation is "add" then print addition of 2 numbers. 
	//Handle the input mismatch exception.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter 1st number: ");
			int a = s.nextInt();
			System.out.println("Enter 2nd number: ");
			int b = s.nextInt();
			System.out.println("Addition of 1st and 2nd number is: "+a+b);
		} catch (InputMismatchException e) {
			System.out.println("Enter Numeric Value");
		}
		
	}

}
