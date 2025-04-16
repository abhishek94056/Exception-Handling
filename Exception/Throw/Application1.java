package Throw;

public class Application1 {
		
		public static void main(String[] args) {
			
			try
			{
				ArithmeticException obj = new ArithmeticException("You're bad in Maths!");
				throw obj;
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}