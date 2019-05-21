package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {

		//��Ʈ��ũ ����� ������ �־����.
		DatagramSocket socket = new DatagramSocket();
		//�������� ��Ŷ�� �����Ѵ�.
		String str = "I am a java programmer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket packet 
			= new DatagramPacket(data, data.length, ip, 7000); //()�ȿ� ������, �����ͱ���, ip, port�� ������
			
		socket.send(packet);
		socket.close();
	}

}
