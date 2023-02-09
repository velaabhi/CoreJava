package coreJava;

abstract class Car{					//abstract class
	public abstract void drive();		//abstract method
	public void playMusic() {			//NonAbstract method
		System.out.println("Playing music");
	}
}

class BMW extends Car{

	public void drive() {		//this method overrides abstract method of class Car
		System.out.println("Car is driven");

	}
	
}
public class Demo_Abstraction {

	public static void main(String[] args) {

		Car c = new BMW();		//ref of abstract and obj of concrete class 
		c.drive();
		c.playMusic();
	}

}
