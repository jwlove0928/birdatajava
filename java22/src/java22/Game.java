package java22;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame{
	public class ImageThread extends Thread {

		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public ImageThread(int x, int y) {
			this.x = x;
			this.y = y;
			FlowLayout flow = new FlowLayout();
			ImageIcon icon = new ImageIcon();
			setLayout(flow);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200);
			add(label);
		}
		
		@Override
		public void run() {
			String[] pic = {"Ichgo.jpg","im3pr4.jpg","indo.jpg","naruto.jpg","rebter.jpg","sp1.jpg","tirno","tr1"};
			for (int i = 0; i < pic.length; i++) {
				try {
					Thread.sleep(1000);
					ImageIcon icon = new ImageIcon(pic[i]);
					label.setIcon(icon);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class CountThread extends Thread {
		
		int x,y;
		JLabel label2;
		public CountThread() {
			FlowLayout flow = new FlowLayout();
			setLayout(flow);
			label2 = new JLabel();
			label2.setFont(new Font("Serif", Font.BOLD, 100));
			label2.setForeground(Color.blue);
			label2.setBounds(x, y, 400, 400);
			add(label2);
			
			
			
		}
		@Override
		public void run() {
			for (int i = 70; i>=1; i--) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				label2.setText(i + "");
				
			}
		}
		
	}

	public Game() {
		setTitle("이미지 및 카운트 게임");
		setSize(1000, 1000);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageThread image = new ImageThread(200, 200);
		CountThread count = new CountThread();
		
		count.start();
		image.start();
		
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Game game = new Game();
	}
}
