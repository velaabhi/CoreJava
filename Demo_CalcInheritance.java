package coreJava;

public class Demo_CalcInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeryAdvCalcInher obj = new VeryAdvCalcInher();
		int r1 = obj.add(8, 5);
		int r2 = obj.sub(8, 5);
		int r3 = obj.mul(8, 5);
		int r4 = obj.div(8, 5);
		double r5 = obj.power(8, 5);
	
		System.out.println(+r1+"  "+r2+"  "+r3+"  "+r4+"  "+r5+"  ");
	}

}
