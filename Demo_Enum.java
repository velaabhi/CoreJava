package coreJava;
//prog for enums - that are named constants
enum Status
{
	RUNNING, FAILED, PENDING, SUCCESS;		//objects or named constants
}

public class Demo_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s = Status.RUNNING;		//since enum is static, we dont need to create object,
		System.out.println(s);				// we directly use classname.enumMember
		
		Status s1 = Status.PENDING;
		System.out.println("Index of PENDING is "+s1.ordinal());
		
		Status[] s2 = Status.values();		// .values() returns all the members of an enum
		System.out.println(s2[1]);										// so we need to use an array to store them
		
		for(Status s3: s2)				//using enhanced for loop to access the array s2
		{
			System.out.print(s3+",");
		}
	}

}
