package �������̽�2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import �������̽�.ActionProcess;

public class Mywindow2 extends JFrame{

	JButton b;
	
	public Mywindow2() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("ù��° ��ư");
		
		add(b);
		
		�������̽�2.ActionProcess action = new �������̽�2.ActionProcess();
		b.addActionListener(action);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mywindow2 name = new Mywindow2();
	}
	
}
