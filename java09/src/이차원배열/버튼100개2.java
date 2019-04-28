package 이차원배열;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나의 버튼들 .... 200개");
		f.setSize(1000, 1000);
		
		f.setLayout(null); //배치부품들 안쓰겠다. (위치를 내가 조정가능)
		
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼" + i);
		}
	
		buttons[0].setBounds(50, 50, 150, 50);
		f.add(buttons[0]);
		buttons[1].setBounds(200, 50, 150, 50);
		f.add(buttons[1]);
		buttons[2].setBounds(350, 50, 150, 50);
		f.add(buttons[2]);
		buttons[3].setBounds(500, 50, 150, 50);
		f.add(buttons[3]);
		buttons[4].setBounds(650, 50, 150, 50);
		f.add(buttons[4]);
		
		
		System.out.println(buttons[4].getText());
		
		
		f.setVisible(true);
	}
}
