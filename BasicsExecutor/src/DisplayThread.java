
public class DisplayThread extends Thread {

Display d;
String name;
public DisplayThread(Display d,String name) {
this.d=d;
this.name=name;
}

public void run(){
	d.wish(name);
}
}
