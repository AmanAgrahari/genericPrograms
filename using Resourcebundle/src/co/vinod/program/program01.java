package co.vinod.program;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class program01 {

	public static void main(String[] args) {
		ResourceBundle rb=null;
		try{
         rb=ResourceBundle.getBundle("co.vinod.dbo.jdbc");
		}
		catch(MissingResourceException e)
		{
			System.out.println("no such properties file found");
		return;
		}
		
		try {
			String username=rb.getString("username");
			String password=rb.getString("password");
			System.out.println("username="+username);
			System.out.println("password="+password);
		} catch (MissingResourceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		}
	}

