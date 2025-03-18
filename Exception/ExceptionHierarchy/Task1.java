package ExceptionHierarchy;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
public class Task1 {
	//1. WAP to accept 10 numbers and save them in an array. 
	//Accept index from the user and print the array element at that index. 
	//Handle the appropriate exceptions.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]= {23,6,7,4,2,8,2,0,38,14};
		System.out.println("Enter arry index: ");		
		try {
			int n = s.nextInt();
			System.out.println("The array element at index "+n+" is: "+a[n]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e1) {
			System.out.println("Enter valid input");
		}finally {
			System.out.println("Thanks for trying to executing me...!");
		}

	}

}
