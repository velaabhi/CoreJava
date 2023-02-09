package coreJava;
//Anonymous Inner class program for abstract class

abstract class A4 {					//since this is an abstract class
	public abstract void show();
}

public class Demo_AbstractAnonyousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
												//hence we can provide implementation of abstract class
		A4 obj = new A4()					//through anonymous inner class 
				{								
					public void show() 	
					{
						System.out.println("In A show abstract ");	
					}
				};
		obj.show();
	}

}
