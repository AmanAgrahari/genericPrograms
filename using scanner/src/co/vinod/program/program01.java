package co.vinod.program;

import java.util.Date;
import co.vinod.util.keyboardUtil;
public class program01 {
	public static void main(String[] args) {
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("enter a no:");
		if(scanner.hasNextInt())
		{
		int num=scanner.nextInt();
		System.out.println("you entered:"+num);
	}
		else
	{
		System.out.println("you are supposed to enter a integer");
	}
	*/
String name;
int age;
double height;
Date dob;
name=keyboardUtil.getString("enter ur name:");
age=keyboardUtil.getInt("enter ur age:");
height=keyboardUtil.getDouble("enter ur height:");
dob=keyboardUtil.getISODate("enter ur dob in dd-mm-yyyy");
System.out.println("name="+name);
System.out.println("age="+age+"years");
System.out.println("height="+height);
System.out.println("born date="+dob);
	}
}