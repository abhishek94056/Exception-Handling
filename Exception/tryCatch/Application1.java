package tryCatch;

public class Application1 {
	public static void main(String[] args) {
		try
		{
			String str = "Java";
			System.out.println(str.charAt(25));
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong. Please try again later!");
		}
	}

}
