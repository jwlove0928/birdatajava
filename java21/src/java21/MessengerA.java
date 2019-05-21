package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	public MessengerA () throws Exception {
		socket = new DatagramSocket(5000);
		list = new JTextArea(6,20);
		list.setFont(new Font("Monospaced", Font.BOLD, 20));
		list.setForeground(Color.BLUE);
		list.setBackground(Color.YELLOW);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
//				System.out.println("내가 입력한 값 : " + data);
				list.append("재우 입력>> " + str + "\n"); //setText와 달리 입력된 값 삭제되지않음
				input.setText(""); //입력한 문자 입력후에 지워지는 기능
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					//소켓으로 패킷을 전송한다.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.0.142");
					DatagramPacket packet 
					= new DatagramPacket(data, data.length, ip, 5000); //()안에 데이터, 데이터길이, ip, port가 들어가야함
					
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("굴림", Font.BOLD, 18));
		input.setForeground(Color.WHITE);
		input.setBackground(Color.BLACK);
		setTitle("메신저A 채팅화면");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false); //창에 입력못하게 막는기능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Jframe창 x눌렀을때 실행종료
		
		setVisible(true);
	}
	
	public void process() throws Exception {
		//패킷받는 코드(무한루프)
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			System.out.println(new String(data));
			list.append("소윤 입력>> " + new String(data) + "\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerA name = new MessengerA();
		name.process();//패킷 보내기전에 받는 코드가 먼저 돌아가야함.
	}

}
