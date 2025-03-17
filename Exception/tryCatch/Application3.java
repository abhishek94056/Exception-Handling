package tryCatch;

public class Application3 {
	public static void main(String[] args) {
		try
		{
			System.out.println(25 / 0);
		}
		catch (Exception e) {
			System.out.println("Error!");
		}

	}

}
