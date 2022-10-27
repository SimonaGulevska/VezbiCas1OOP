package zadaca5;

public class Glavna {

	public static void main(String[] args) {
		String unit="степен";
		String value="2.5";
		double temperature=Double.parseDouble(value);
		System.out.println("Температурата изнесува "+(int)(temperature*10)+" "+unit+"и.");
	}
}
