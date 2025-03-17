package tryCatchFinally;

public class Application3 {
	public static void main(String[] args) {
		try {
			System.out.println(14/0);
		} catch (Exception e) {
			System.out.println("Given number is not divided by zero");
		}
		finally {
			System.out.println("Learn Math..!");
		}
	}

}
