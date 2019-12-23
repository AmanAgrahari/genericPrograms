package generics;

public class Guest {

	public static void main(String[] args) {
	
		Glass<Juice> g= new Glass<Juice>();
		Juice juice= new Juice();
		g.liquid=juice;
		Tray tray=new Tray();
		tray.add(g);
		
	}

}
