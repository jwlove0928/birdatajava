package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import 인터페이스.ActionProcess;

public class Mywindow2_1 extends JFrame implements	ActionListener{

	JButton b;
	
	public Mywindow2_1() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("첫번째 버튼");
		
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
