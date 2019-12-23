import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		
		QuoteService quoteService = new QuoteService();
		
		ServerSocket serSocket = new ServerSocket(9999);
		
		System.out.println("waiting for the client listening to 9999");
		
		while(true)
		{
			System.out.println("waiting for the client ");
			Socket sock = serSocket.accept();
			
			
			//create a new thread to service the client
			
			System.out.println("Starting a thread which will service the client");
			new ServiceThread(sock).start();
			
			/*InputStream in= sock.getInputStream();
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
			
			sock.close();*/
		}
	}

}
