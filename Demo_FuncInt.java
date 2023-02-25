package coreJava;

@FunctionalInterface
interface A6		//Single Abstract Method Interface SAMI
{
	void show();
}

public class Demo_FuncInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A6 obj = new A6() {
				
				public void show() {
					System.out.println("In show");
				}
			};
			obj.show();
	}

}
