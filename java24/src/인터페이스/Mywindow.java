package �������̽�;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow extends JFrame{

	public Mywindow() {
		setSize(300, 300);
		JButton b = new JButton("���� ������.");
		add(b);
		ActionProcess action = new ActionProcess();
		b.addActionListener(action);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Mywindow name = new Mywindow();
	}

}
