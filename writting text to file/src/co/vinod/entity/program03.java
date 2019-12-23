package co.vinod.entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class program03 {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer=new FileWriter("sample.txt");
		BufferedWriter bf=new BufferedWriter(writer);
		PrintWriter out=new PrintWriter(bf);
		out.println("my name is vinod\n");
		out.println("i am from banglore");
		out.println(25);
		out.close();
		bf.close();
		writer.close();
		System.out.println("end of demo");
	}
}

