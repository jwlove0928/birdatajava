package �������̽�2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import �������̽�.ActionProcess;

public class Mywindow2_2 extends JFrame implements	ActionListener{

	JButton b,b1;
	
	public Mywindow2_2() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("ù��° ��ư");
		b1 = new JButton("�ι�° ��ư");
		
		add(b);
		add(b1);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mywindow2_2 name = new Mywindow2_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("ù��° ��ư,�� �����̱���");
		}else if(e.getSource() == b1) {
			System.out.println("�ι�° ��ư,�� �����̱���.");
		}
	}
	
}
