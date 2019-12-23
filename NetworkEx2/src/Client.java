import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//loopback address 127.0.0.1
		System.out.println("connecting to the server");
		Socket sock = new Socket("127.0.0.1",9999);
		
		System.out.println("connected to server");
		
		System.out.println("Enetr product name");
		Scanner scan = new Scanner(System.in);
		String product = scan.nextLine();
		//String product ="a";
		
		InputStream in= sock.getInputStream();
		OutputStream out= sock.getOutputStream();
		
		System.out.println("sending product information");
		out.write(product.getBytes());
		
		byte[] response = new byte[1024];
		in.read(response);
		
		System.out.println("Received response from server..."+ new String(response).trim());
		sock.close();
		
		
	}

}
