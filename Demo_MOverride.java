package coreJava;

class Calcu{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}

class AdvCalc extends Calcu{
	public int add(int n1, int n2)
	{
		return n1+n2+4;
	}
}

public class Demo_MOverride {	//same name, same parameters, diff implementation

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvCalc a = new AdvCalc();
		int res = a.add(5, 6);
		System.out.println("Res is "+res);
		
		Calcu c = new Calcu();
		int res1 = c.add(5, 6);
		System.out.println("Res is "+res1);
	}

}
