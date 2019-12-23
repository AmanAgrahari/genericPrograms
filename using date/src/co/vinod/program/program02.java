package co.vinod.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program02 {

	public static void main(String[] args) {
		Date dt=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
	sdf.setLenient(false);
		System.out.println(sdf.format(dt));
	System.out.println("eneter ur dob in dd-mm-yyyy format:");
	Scanner scanner =new Scanner(System.in);
	String input=scanner.nextLine();
	try{
		dt=sdf.parse(input);
		System.out.println(dt);
	}
	catch(ParseException e){
	System.out.println("invalid input");
	}
	scanner.close();
	
}
}