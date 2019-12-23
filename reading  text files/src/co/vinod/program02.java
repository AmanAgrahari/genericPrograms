package co.vinod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class program02{

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
	System.out.println("enetr the complete path of a file");
	String path=sc.nextLine();
	FileReader reader = new FileReader(path);
	BufferedReader in=new BufferedReader(reader);
	String line;
	while((line=in.readLine())!=null)
		System.out.println(line);
	reader.close();
	sc.close();
	}
}
