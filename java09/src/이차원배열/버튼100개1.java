package 이차원배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개1 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나의 버튼들 .... 100개");
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton[] buttons = new JButton[100];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼");
		}
		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}
}
