package coreJava;

class Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand+" "+price+" "+name);
	}
}
public class Demo_StaticVari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1000;
		Mobile.name = "SmartPhone";
	
		Mobile obj2 = new Mobile();
		obj2.brand = "Nokia";
		obj2.price = 2000;
		
		obj1.show();
		obj2.show();
	}

}
