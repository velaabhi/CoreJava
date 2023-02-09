package coreJava;

class A2{
	public void show() {
		System.out.println("In A show");
	}
	
	class B2{
		public void config() {
			System.out.println("In B config");
		}
	}
	
	static class C2{
		public void def() {
			System.out.println("In C def");
		}
	}
	
}
public class Demo_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new A2();
		obj.show();
		
		A2.B2 obj1 = obj.new B2();		// in RHS obj. is used cz 'new B2()' object is an instance of 'obj' object
		obj1.config();
		
		A2.C2 obj2 = new A2.C2();	//in RRHS we used 'A2.' cz now C2 is an inner static class and hence needs 
										// class name of Outer class ie A2 in order to be accessed
	}

}
