package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import 인터페이스.ActionProcess;

public class Mywindow2_2 extends JFrame implements	ActionListener{

	JButton b,b1;
	
	public Mywindow2_2() {
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b = new JButton("첫번째 버튼");
		b1 = new JButton("두번째 버튼");
		
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
			System.out.println("첫번째 버튼,을 누르셨군요");
		}else if(e.getSource() == b1) {
			System.out.println("두번째 버튼,을 누르셨군요.");
		}
	}
	
}
