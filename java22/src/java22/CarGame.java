package java22;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread {

		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public CarThread(String fileName, int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
			
		}
		@Override
		public void run() {
			
			Random random = new Random();
			
			for (int i = 0; i <= 200; i++) {
				int ran = random.nextInt(10);
				int miter = ran;
				label.setBounds(x, y, 100, 100);
				x = x+miter;
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//for문.. x축 random으로 늘려서 경기!!!
			//radom한 int값 발생.
			//발생한 int값 x축에 더해줌.
			//setBound로 재설된 x축값으로 위치 지정.
			
		}
	}

	public CarGame() {
		setTitle("나의 스레드 자동차 프로그램");
		setSize(2000, 2000);
		
		CarThread car1 = new CarThread("car1.gif", 100, 0);
		CarThread car2 = new CarThread("car2.gif", 100, 100);
		CarThread car3 = new CarThread("car3.gif", 100, 200);
		
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CarGame car = new CarGame();
	}
}
