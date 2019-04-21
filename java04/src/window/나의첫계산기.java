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

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;
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
		
		JButton b = new JButton("두 수를 계산");
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 + number2);
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		JButton b2 = new JButton("-");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 - number2);
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		JButton b3 = new JButton("*");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 * number2);
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 30));
		JButton b4 = new JButton("/");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 / number2);
			}
		});
		b4.setFont(new Font("굴림", Font.PLAIN, 30));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 + number2);
			}
		});
		b.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(b);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}
}
