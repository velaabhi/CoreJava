package coreJava;

interface A7{
	void show(int i);
}

public class Demo_LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//		A7 obj = () -> System.out.println("In show ");
//			obj.show();
			
			A7 obj1 = (int i)->System.out.println("In show"+i);
			
			obj1.show(5);
	}

	
}
