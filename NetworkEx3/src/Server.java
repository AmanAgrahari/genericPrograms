import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) throws IOException {
	
		
		DatagramSocket dpSock = new DatagramSocket(8989);
		
		//packet to receive the content
		DatagramPacket packet = new DatagramPacket(new byte[1000], 100);
		
		dpSock.receive(packet);
		
		System.out.println(new String(packet.getData()));
		
		System.out.println("Obtaioned from ip :" +packet.getAddress());
		System.out.println("Obtaioned from Port :" +packet.getPort());
		
		dpSock.close();
		

	}

}
