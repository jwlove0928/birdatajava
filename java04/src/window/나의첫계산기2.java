package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기2 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField n3;
	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(Color.BLACK);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(500,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("<<<나의 계산기>>>");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 43));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(Color.PINK);
		n1.setForeground(Color.BLUE);
		n1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>>");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setForeground(Color.BLUE);
		n2.setFont(new Font("굴림", Font.BOLD, 30));
		n2.setColumns(10);
		n2.setBackground(Color.PINK);
		f.getContentPane().add(n2);
		
		JButton b = new JButton("계산");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String num1 = n1.getText();
				String num2 = n2.getText();
				String result = n3.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				int imsi = 0;
//				if(result.equals("+")) {
//					System.out.println(number1 + number2);
//				}else if (result.equals("-")){
//					System.out.println(number1 - number2);
//				}else if (result.equals("*")){
//					System.out.println(number1 * number2);
//				}else if (result.equals("/")){
//					System.out.println(number1 / number2);
//				}else {
//					System.out.println("연산할수 없는 기호입니다.");
//					}
//				}
//			});
				
				if(result.equals("+")) {
					imsi = number1+number2;
				}else if(result.contentEquals("-")) {
					imsi = number1-number2;
				}else if(result.contentEquals("*")) {
					imsi = number1*number2;
				}else if(result.contentEquals("/")) {
					imsi = number1/number2;
				}else {
					System.out.println("연산할수 없는 기호입니다.");
				}
				if(imsi != 0)
				System.out.println("두수의 연산한 값은 : " + imsi + "입니다.");
			}
		});
		JLabel label_1 = new JLabel("연산자>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(label_1);
		
		n3 = new JTextField();
		n3.setForeground(Color.BLUE);
		n3.setFont(new Font("굴림", Font.BOLD, 30));
		n3.setColumns(10);
		n3.setBackground(Color.PINK);
		f.getContentPane().add(n3);
		b.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(b);

		f.setVisible(true);
		
	}
}
