package ExceptionHierarchy;
import java.util.Scanner;
public class Task3 {
	//3. WAP to accept name of friend. 
	//Accept index from the user and print the character at that index. 
	//Handle the appropriate exceptions.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String: ");
		try {
			String str = s.nextLine();
			System.out.println("The 5th Charecter of given index is: ");
			System.out.println(str.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
