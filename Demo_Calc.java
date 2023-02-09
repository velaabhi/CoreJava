package coreJava;

class Calc{
	public int add (int n1,int n2) {
		int r = n1+n2;
		return r;
	}
}

public class Demo_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 =20;
//		int num2 = 30;
		int num1,num2;
		Calc c  = new Calc();
		int r = c.add(num1=30, num2=70);
		System.out.println("Res is "+r);
	}

}
