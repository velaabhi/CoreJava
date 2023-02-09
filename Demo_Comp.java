package coreJava;

class Comp{
	public void playMusic() {
		System.out.println("Playing Music");
	}
	
	public String getMePen(int cost) {
		if(cost>=10)
			return "Pen";
		
		return "Nothing";
	}
}
public class Demo_Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost  = 2;
		Comp c = new Comp();
		String str = c.getMePen(cost);
		System.out.println(str);
		c.playMusic();
	}

}
