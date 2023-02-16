package coreJava;

enum Laptop {
	Mac(2000), XPS(2200), Surface, Thinkpad(4300); // Surface is def constr, others are parameterised constr
	// now lets define these constructors

	private int price; // to use 'price' variable we need getter & setter methods

	private Laptop(int price) // parameterised constr defination
	{
		this.price = price;
		System.out.println("In laptop " + this.name());
	}

	private Laptop()		//default constructor defination
	{
		price = 500; 
	}
		public int getPrice()
		{
			return price;
		}
		
		public void setPrice(int price)
		{
			this.price = price;
		}
}



public class Demo_Enum_Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Laptop lap : Laptop.values()) {
			System.out.println(lap + " : " + lap.getPrice());
		}
	}

}
