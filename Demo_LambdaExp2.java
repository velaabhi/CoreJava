package coreJava;

interface A8{
	int add(int i, int j);
}
public class Demo_LambdaExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A8 obj = (int i, int j) -> (i+j);
		
		int res= obj.add(5,7);
		System.out.println("Addition is "+res);
	}

}
