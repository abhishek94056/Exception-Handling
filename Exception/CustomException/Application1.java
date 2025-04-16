package CustomException;

public class Application1 {
	public static void main(String[] args) {
		int temp = 23;
		System.out.println("200 LOC");
		if(temp>=20) {
			try {
				TemperatureRiseException obj = new TemperatureRiseException();
				throw obj;
			} catch (TemperatureRiseException e) {
				System.out.println("Beep in the system");
			}
		}
	}
}
