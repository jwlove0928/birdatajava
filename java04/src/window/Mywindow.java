package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Mywindow {
	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램");

		f.setSize(372, 336);
		
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		JLabel label2 = new JLabel("당신이 사용하는 개발 툴을 입력해주세요.");
		label2.setFont(new Font("굴림", Font.PLAIN, 16));
		label2.setForeground(Color.RED);
		label.setFont(new Font("굴림", Font.PLAIN, 16));
		label.setForeground(Color.BLUE);
		
		JTextField text = new JTextField(30);
		JTextField text2 = new JTextField(30);
		text2.setFont(new Font("굴림체", Font.PLAIN, 20));
		text.setFont(new Font("굴림체", Font.PLAIN, 20));
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		//글자들
		//입력받는 화면(한줄짜리)
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(label2);
		f.getContentPane().add(text2);
		
		JButton button = new JButton("나를 눌러요.");
		button.setFont(new Font("굴림", Font.PLAIN, 16));
		button.setForeground(Color.GREEN);
		
		//버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌려졌군요...!!");
				String data = text.getText();
				System.out.println("당신의 주요 과목은 : " + data);
				
				String data2 = text2.getText();
				System.out.println("당신의 주요 툴은 : " + data2);
				
			}
		});
		f.getContentPane().add(button);
		
		
		f.setVisible(true);
	}
}
