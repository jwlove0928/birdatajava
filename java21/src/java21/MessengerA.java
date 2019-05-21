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
//				System.out.println("���� �Է��� �� : " + data);
				list.append("��� �Է�>> " + str + "\n"); //setText�� �޸� �Էµ� �� ������������
				input.setText(""); //�Է��� ���� �Է��Ŀ� �������� ���
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					//�������� ��Ŷ�� �����Ѵ�.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.0.142");
					DatagramPacket packet 
					= new DatagramPacket(data, data.length, ip, 5000); //()�ȿ� ������, �����ͱ���, ip, port�� ������
					
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("����", Font.BOLD, 18));
		input.setForeground(Color.WHITE);
		input.setBackground(Color.BLACK);
		setTitle("�޽���A ä��ȭ��");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false); //â�� �Է¸��ϰ� ���±��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Jframeâ x�������� ��������
		
		setVisible(true);
	}
	
	public void process() throws Exception {
		//��Ŷ�޴� �ڵ�(���ѷ���)
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			System.out.println(new String(data));
			list.append("���� �Է�>> " + new String(data) + "\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerA name = new MessengerA();
		name.process();//��Ŷ ���������� �޴� �ڵ尡 ���� ���ư�����.
	}

}
