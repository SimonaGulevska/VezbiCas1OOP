package zadaca6;

public class Glavna {

	public static void main(String[] args) {
		String article1="чоколадо";
		String price1="50";
		String quantity="5";
		String article2="сок";
		String price2="35";
		String unit="денар";
		int article1Price=Integer.parseInt(price1)*Integer.parseInt(quantity);
		int article2Price=Integer.parseInt(price2)*Integer.parseInt(quantity);
		int total=article1Price+article2Price;
		System.out.println("Сметка:");
		System.out.println("Едно "+article1+"-"+price1+" "+unit+"и.");
		System.out.println(price1+" x "+quantity+" = "+article1Price);
		System.out.println("Еден "+article2+"-"+price2+" "+unit+"и.");
		System.out.println(price2+" x "+quantity+" = "+article2Price);
		System.out.println("Вкупна цена: "+total);
	}

}
