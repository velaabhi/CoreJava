package coreJava;
//Anonymous Inner class program
class A3
{
	public void show() 
	{
		System.out.println("In A show");
	}
}
public class Demo_AnnonymousInnerCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 obj = new A3()
				{								//anonymous inner class
					public void show()
					{
						System.out.println("In new show");
					}
				};
		obj.show();
		
	}

}
