package coreJava;

class A1{
	public void show1() {
		System.out.println("In A show");
	}
}

class B1 extends A1{
	public void show2() {
		System.out.println("In B show");
	}
}

public class Demo_UpDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 obj = new B1();	//upcasting cz object of B is accessing method of superclass
		obj.show1();
		
		B1 obj1 = (B1)obj;	//downcasting cz reference of A is downcasted to class B method 
		obj1.show2();
	
	}
	
	

}
