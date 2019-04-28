package 이차원배열;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개만들기Test {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		Random random = new Random();
		JButton[] button = new JButton[100];
			      
		f.setSize(1000, 1000);
		f.setLayout(null);
			      
		for (int i = 0; i < button.length; i++) {
			 button[i] = new JButton("나는 버튼 : " + i);
		}
		for (int i = 0; i < button.length; i++) {
			    int x = random.nextInt(1000);
			    int y = random.nextInt(800);
			    button[i].setBounds(x, y, 300, 100);
			    f.add(button[i]);
		}
		f.setTitle("나의 버튼 100개 만들기");
		f.setVisible(true);
	 }
}
