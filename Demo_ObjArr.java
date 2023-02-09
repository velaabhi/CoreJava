package coreJava;

class Stud{
	int roll;
	String name;
	int marks;
}
public class Demo_ObjArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stud s1 = new Stud();
	s1.roll = 1;
	s1.name = "Abhi";
	s1.marks = 87;
	
	Stud s2 = new Stud();
	s2.roll = 2;
	s2.name = "Rupesh";
	s2.marks = 90;
	
	Stud s3 = new Stud();
	s3.roll = 3;
	s3.name = "Akshay";
	s3.marks = 93;
	
	Stud s[] = new Stud[3];
	s[0] = s1;
	s[1] = s2;
	s[2] = s3;
	
	for(int i=0;i<3;i++)
	{
		System.out.println(s[i].roll+"-"+s[i].name+"-"+s[i].marks);
	}
	
	}

}
