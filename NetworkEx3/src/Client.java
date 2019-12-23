import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

	public static void main(String[] args) throws IOException {
		
		/*
		 * o/p:
		 * Hello from so and so....
		 * Obtaioned from ip :/172.16.60.218
		 * Obtaioned from Port :61039
		 */
		DatagramSocket dpSock = new DatagramSocket();
		
		String message= "Hello from so and so....";
		
		byte [] data = message.getBytes();
		
		//packet to receive the content
		DatagramPacket packet = new DatagramPacket(data,data.length,InetAddress.getLocalHost(),8989);
		
		dpSock.send(packet);
		
		dpSock.close();

	}

}
