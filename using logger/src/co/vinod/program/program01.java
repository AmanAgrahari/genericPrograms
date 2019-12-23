package co.vinod.program;

import java.util.logging.Level;
import java.util.logging.Logger;

public class program01 {

	public static Logger logger=Logger.getLogger(program01.class.getName());
public static void main(String[] args) {
	
/*	Logger logger=Logger.getLogger("co.vinod");
	Logger logger1=Logger.getLogger("co.vinod");
System.out.println(logger==logger1);
*/
	logger.setLevel(Level.WARNING);
	//logger.setLevel(Level.SEVERE);
	logger.info("main func has satarted...");
	int n,d,q;
	try {
		n=102;
		d=0;
		q=n/d;
		logger.info("q="+q);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.severe("could not perform div as denominator is zero");
		e.printStackTrace();
	}
	logger.info("main func has finished..");

}
}
