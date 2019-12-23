package co.vinod.entity;

import java.io.FileWriter;
import java.io.IOException;

public class program01 {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer;
		writer=new FileWriter("info.txt");
		writer.write("my name is vinod\n");
		writer.write("i am from banglore");
		writer.close();
		System.out.println("end of demo");
	}
}
