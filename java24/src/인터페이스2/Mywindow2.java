package 인터페이스2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import 인터페이스.ActionProcess;

public class Mywindow2 extends JFrame{

	JButton b;
	
	public Mywindow2() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("첫번째 버튼");
		
		add(b);
		
		인터페이스2.ActionProcess action = new 인터페이스2.ActionProcess();
		b.addActionListener(action);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mywindow2 name = new Mywindow2();
	}
	
}
