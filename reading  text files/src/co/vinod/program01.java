package co.vinod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class program01 {

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
	System.out.println("enetr the complete path of a file");
	String path=sc.nextLine();
	FileReader reader = new FileReader(path);
	
	int ch;
	while((ch=reader.read()) !=-1)
	{
		System.out.println((char)ch);
	}
	reader.close();
	
	}	
}
