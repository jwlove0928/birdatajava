package �������̽�2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import �������̽�.ActionProcess;

public class Mywindow2_1 extends JFrame implements	ActionListener{

	JButton b;
	
	public Mywindow2_1() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("ù��° ��ư");
		
		add(b);
		
		b.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mywindow2_1 name = new Mywindow2_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
}
