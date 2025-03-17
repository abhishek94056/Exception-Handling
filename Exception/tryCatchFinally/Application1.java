package tryCatchFinally;

public class Application1 {

	public static void main(String[] args) {
		try {
			String str ="abhi";
			System.out.println(str.charAt(4));
		} catch (Exception e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		finally {
			System.out.println("Thanks for try to executing me..!");
		}
	}

}
