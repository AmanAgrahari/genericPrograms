package co.vinod.program;

import java.io.FileOutputStream;
import java.util.Properties;

public class program01 {
	public static void main(String[] args) throws Exception {
		
	Properties props=new Properties();
	
	props.setProperty("driver", "com.mysql.jdbc.Driver");
	props.setProperty("url", "jdbc:mysql://localhost:3306/mydb");
	props.setProperty("username", "root");
	props.setProperty("password", "secret");
		
	FileOutputStream file=new FileOutputStream("src/co/vinod/jdbc.properties");
	props.store(file, "jdbc properties for mysql");
	file.close();
	System.out.println("end of demo");
	}

}
