package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {

		//네트워크 통신은 소켓이 있어야함.
		DatagramSocket socket = new DatagramSocket();
		//소켓으로 패킷을 전송한다.
		String str = "I am a java programmer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket packet 
			= new DatagramPacket(data, data.length, ip, 7000); //()안에 데이터, 데이터길이, ip, port가 들어가야함
			
		socket.send(packet);
		socket.close();
	}

}
