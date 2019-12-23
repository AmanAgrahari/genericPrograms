package co.vinod.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class keyboardUtil {

	private keyboardUtil()
	{
}
	public static int getInt(String message){
	
		System.out.println(message);
		Scanner scanner=new Scanner(System.in);
		return scanner.nextInt();
	}
	public static double getDouble(String message){
		
		System.out.println(message);
		Scanner scanner=new Scanner(System.in);
		return scanner.nextDouble();
	}	
	public static String getString(String message){
		
		System.out.println(message);
		Scanner scanner=new Scanner(System.in);
		return scanner.nextLine();
	}	
	public static Date getISODate(String message){
		
		String pattern="yyyy-MM-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		System.out.println(message);
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		try{
			return sdf.parse(input);
		}
		catch(ParseException e){
			return null;
		}
	}	
}
