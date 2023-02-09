package coreJava;
class A{
	public A() {		// default constructor
		super();		//calls Object class
		System.out.println("In A");
	}
	public A(int n) {
		this();
		//super();
		System.out.println("In A int"+n);
	}
}

class B extends A{
	public B()		//def constructor
	{
		//super();		//so u cant call parameterised constructor of super class from def const of sub class
		//this();		// cant use this() here cz it causes Recursive Constr Invocation error
		System.out.println("In B");
	}
	public B(int n) {
		//super();
		super(n);		// but u can call def or parameterised constr of super class from para constr of subclass
		//this();		// here it will call Def Constr of same class
		System.out.println("In B int" +n);
	}
}
public class Demo_SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);
		A obj1 = new A(4);
	}

}
