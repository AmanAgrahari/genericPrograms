import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//created one socket
		ServerSocket serSocket = new ServerSocket(9999);
		System.out.println("waiting for the client");
		// as whenever we call accept we r waiting on this port"9999" for the client
		//once client arrives it creates a separate socket which is used for communication "sock"
		Socket sock = serSocket.accept();
		
		System.out.println("Client connected....");
		
		
		//the above socket has two streams i.e i/p & o/p streams
		//to read the data send by the client
		InputStream in= sock.getInputStream();
		//to write the data send by the client
		OutputStream out= sock.getOutputStream();
		
		byte buffer[]= new byte[1024];
		//waiting for the client to send the message
		in.read(buffer);
		
		System.out.println("Received from client--" + new String(buffer).trim());
		
		out.write("Hello from server..." .getBytes());
		
		sock.close();
		serSocket.close();
		

	}

}
