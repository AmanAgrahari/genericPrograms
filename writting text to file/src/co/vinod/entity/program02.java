package co.vinod.entity;

import java.io.FileWriter;
import java.io.PrintWriter;

public class program02 {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer;
		writer=new FileWriter("more-info.txt");
		PrintWriter out=new PrintWriter(writer);
		out.println("my name is vinod\n");
		out.println("i am from banglore");
		out.println(25);
		out.println();
		out.println();
		String name="vinod";
		String city="Banglore";
		out.printf("my name is %s, and i am from %s \n", name ,city);
		out.close();
		writer.close();
		System.out.println("end of demo");
	}
}
