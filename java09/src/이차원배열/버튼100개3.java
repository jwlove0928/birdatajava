package 이차원배열;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나의 버튼들 .... 200개");
		f.setSize(1000, 1000);
		
		f.setLayout(null);
		
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼" + i);
		}
		Random random = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(1000);
			int y = random.nextInt(800);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}
}
