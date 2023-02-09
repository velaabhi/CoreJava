package coreJava;

class Aa{
	public void show() {
		System.out.println("In A show");
	}
}

class Bb extends Aa{
	public void show() {
		System.out.println("In B show");
	}
}

class Cc extends Bb{
	public void show() {
		System.out.println("In C show");
	}
}

public class Demo_DynamicMDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa obj = new Aa();
		obj.show();
		
		obj = new Bb();
		obj.show();
		
		obj = new Cc();
		obj.show();
	}

}
