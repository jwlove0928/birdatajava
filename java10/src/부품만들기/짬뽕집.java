package 부품만들기;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 짬뽕집 {
	
	static int witch = 0;
	private static JTextField text1;
	private static JTextField text2;
	
	public static void main(String[] args) {
		
		짬뽕집부품 part = new 짬뽕집부품();
		
		part.count = 0;
		int Jajjang = part.price();
		int Jambbong = part.price();
		int Udong = part.price();
		
		JFrame f = new JFrame();
		JButton button = new JButton();
		f.setTitle("주문하세요...");
		
		String[] pic = {"1.jpg","2.jpg","3.jpg","4.jpg"};
		
		JButton button1 = new JButton("짬뽕");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ImageIcon image2 = new ImageIcon(pic[witch+1]);
					button.setIcon(image2);
					part.count += 1;
					text1.setText(String.valueOf(part.count));
					text2.setText(String.valueOf(Jajjang*part.count));
			}
		});
		button1.setBackground(Color.ORANGE);
		button1.setForeground(Color.BLACK);
		button1.setFont(new Font("굴림", Font.BOLD, 20));
		JButton button2 = new JButton("우동");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {
					ImageIcon image3 = new ImageIcon(pic[witch+2]);
					button.setIcon(image3);
					part.count += 1;
					text1.setText(String.valueOf(part.count));
					text2.setText(String.valueOf(Jambbong*part.count));
				}
			}
		});
		button2.setBackground(Color.ORANGE);
		button2.setForeground(Color.BLACK);
		button2.setFont(new Font("굴림", Font.BOLD, 20));
		JButton button3 = new JButton("자장");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {
					ImageIcon image4 = new ImageIcon(pic[witch+3]);
					button.setIcon(image4);
					part.count += 1;
					text1.setText(String.valueOf(part.count));
					text2.setText(String.valueOf(Udong*part.count));
				}
			}
		});
		button3.setBackground(Color.ORANGE);
		button3.setForeground(Color.BLACK);
		button3.setFont(new Font("굴림", Font.BOLD, 20));
		
		FlowLayout flow = new FlowLayout();
		
		ImageIcon image = new ImageIcon(pic[witch]);
		f.getContentPane().add(button1);
		f.getContentPane().add(button2);
		f.getContentPane().add(button3);
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("개수");
		label.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(label);
		
		text1 = new JTextField();
		text1.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("금액");
		f.getContentPane().add(lblNewLabel);
		
		text2 = new JTextField();
		text2.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(text2);
		text2.setColumns(10);
		button.setIcon(image);
		
		f.getContentPane().add(button);
		f.setSize(700,700);
		f.setVisible(true);
		
	}
}
