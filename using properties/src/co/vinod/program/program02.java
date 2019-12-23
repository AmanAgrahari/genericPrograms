package co.vinod.program;

import java.io.FileInputStream;
import java.util.Properties;

public class program02 {
	public static void main(String[] args) throws Exception {
		
		Properties props =new Properties();
		FileInputStream in =new FileInputStream("src/co/vinod/jdbc.properties");
	props.load(in);
	in.close();
	
	for(String key:props.stringPropertyNames()){
	System.out.println(key+ "-->" + props.getProperty(key));	
	}
		

	}

}
