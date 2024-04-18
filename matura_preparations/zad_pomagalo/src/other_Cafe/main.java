package other_Cafe;

public class main {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("Espresso",3.50,Size.SMALL,2);
		Tea tea = new Tea("Green Tea",2.00,Size.MEDUIM,"green");
		Coffee coffee2 = new Coffee("Cappuccino",4.00,Size.LARGE,3);
		System.out.println(coffee);
		System.out.println(tea);
		System.out.println(coffee2);
	
	}

}
