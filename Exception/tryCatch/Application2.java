package tryCatch;
import java.util.Scanner;
public class Application2 {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int n = sc.nextInt();
			System.out.println("Square = " + n * n);
		}
		catch (Exception e) {
			System.out.println("Input mis-matched!");
		}
	}

}
