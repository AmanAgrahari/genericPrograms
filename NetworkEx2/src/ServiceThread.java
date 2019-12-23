import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServiceThread  extends Thread{
	
	Socket sock;
	
	QuoteService quoteService = new QuoteService();
	
	public ServiceThread(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
	
		try {
			InputStream in= sock.getInputStream();
			OutputStream out= sock.getOutputStream();
			
			System.out.println("waiting for product information from the client");
			
			byte buffer[]= new byte[1024];
			in.read(buffer);
			
			String product= new String(buffer).trim();
			System.out.println("Received product name from client --" + product);
			
			String  price = quoteService.getQuote(product);
			if(price==null) {
				price ="Invalid product";
			}
			out.write(price.getBytes());
			
			System.out.println("Response sent.....");
			
			sock.close();
		}catch(Exception e) {}
		
	}
	

}
