package coreJava;

interface A5
{
	int a = 9;				//variable inside an interface is Final and Static
	void show();
	void config();
}

interface X
{
	void run();
}

class B2 implements A5,X		//Interface supports Multiple Inheritance
{
	public void show()
	{
		System.out.println("In show of A");
	}
	
	public void config()
	{
		System.out.println("In config of A");
	}
	
	public void run()
	{
		System.out.println("In run of X");
	}
}

public class Demo_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj = new B2();			//using ref of A interface and object of B
		obj.config();
		obj.show();
		System.out.println(obj.a);
		
		X obj1 = new B2();
		obj1.run();
	}
}
