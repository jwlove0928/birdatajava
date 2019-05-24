package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame {

	JButton b, b2; //전역변수 선언.
	
	public Mywindow3() {
		b = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		setSize(300, 300);
		add(b);
		add(b2);
//		ActionProcess action = new ActionProcess();
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		ActionListener action = new ActionListener() { //익명클래스를 이용
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요");
			}
		};
		
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼을 눌렀군요");
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Mywindow3 name = new Mywindow3();
	}

}
