package 이차원배열;

import java.awt.FlowLayout;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템 {
	
	public static void main(String[] args) {
		String[] movies = {"m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG"};
		//자바는 필요한 부분(class)를 복사해서
		//조립해서 코딩하는 방식
		//부품(객체, 대상)조립식 프로그램
		//객체지향형 프로그램(Object-Oriented Program,OOP)
		
//		Color.red : static(정적)
//		new Button : instance
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(300, 514);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		img.setForeground(Color.RED);
		img.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon("m1.PNG");
		
		img.setIcon(icon);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
			}
		});
		b1.setText("<<< 생일 >>>");
		b1.setForeground(Color.RED);
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		b2.setForeground(Color.RED);
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setText("<< 헬보이 >>");
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		b3.setForeground(Color.RED);
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setText("< 돈(money) >");
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		b4.setForeground(Color.RED);
		b4.setFont(new Font("굴림", Font.BOLD, 20));
		b4.setText("<<파이프비트>>");
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton();
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		b5.setForeground(Color.RED);
		b5.setFont(new Font("굴림", Font.BOLD, 20));
		b5.setText("<<< 어스 >>>");
		f.getContentPane().add(b5);
		//객체화
//		SQL sql = new SQL("select * from member"); 임의로 만든것
		
		f.setVisible(true);
		
	}

}
