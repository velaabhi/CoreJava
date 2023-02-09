package coreJava;

class Human{
	private String name;
	private  int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
public class Demo_Encaps {
	public static void main(String[] args) {
	Human h = new Human();
	h.setAge(5);
	h.setName("Abhi");
	
	System.out.println(h.getName()+"-"+h.getAge());
	}
}
