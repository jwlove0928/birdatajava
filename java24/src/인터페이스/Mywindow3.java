package �������̽�;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame implements ActionListener{

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
		b.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Mywindow3 name = new Mywindow3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("���� ������.�� �����̱���");
		}else if(e.getSource() == b2){
			System.out.println("���� ������.�� �����̱���.");
		}
	}

}
