package 이차원배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 이미지배열Test {
	
	static int witch = 0;
	static int witch2 = 4;

	public static void main(String[] args) {
		      
		String[] pic = {"1.jpg","2.png","3.jpg","4.jpg","5.png"};
		      
		      
		  JFrame f = new JFrame();
		  FlowLayout flow = new FlowLayout();

		      JButton image = new JButton();
		      ImageIcon icon = new ImageIcon(pic[witch]);
		      image.setIcon(icon);
		      JButton jb2 = new JButton();
		      jb2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            if(witch2 == 0) {
		               JOptionPane.showMessageDialog(null, "왼쪽 마지막 사진입니다.");
		            }else {
		               ImageIcon icon2 = new ImageIcon(pic[witch2-1]);
		               image.setIcon(icon2);
		               witch2--;
		            }
		         }
		      });
		      jb2.setFont(new Font("굴림", Font.BOLD, 20));
		      jb2.setForeground(Color.RED);
		      jb2.setText("<< 왼쪽 >>");
		      JButton jb3 = new JButton();
		      jb3.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            if(witch == 4) {
		               JOptionPane.showMessageDialog(null, "오른쪽 마지막 사진입니다.");
		            }else {
		               ImageIcon icon1 = new ImageIcon(pic[witch+1]);
		               image.setIcon(icon1);
		               witch++;
		            }
		         }
		      });
		      jb3.setText("<< 오른쪽 >>");
		      jb3.setForeground(Color.GREEN);
		      jb3.setFont(new Font("굴림", Font.BOLD, 20));
		      
		      f.setSize(300, 600);
		      f.getContentPane().setLayout(flow);
		      f.setTitle("사진 순차대로 넘기기");
		      
		      f.getContentPane().add(image);
		      f.getContentPane().add(jb2);
		      f.getContentPane().add(jb3);
		      
		      f.setVisible(true);
		   }
		}
