package �������̽�2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame {

	JButton b, b2; //�������� ����.
	
	public Mywindow3() {
		b = new JButton("���� ������.");
		b2 = new JButton("���� ������.");
		setSize(300, 300);
		add(b);
		add(b2);
//		ActionProcess action = new ActionProcess();
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		ActionListener action = new ActionListener() { //�͸�Ŭ������ �̿�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ��������");
			}
		};
		
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ι�° ��ư�� ��������");
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Mywindow3 name = new Mywindow3();
	}

}
