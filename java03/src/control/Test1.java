package control;

import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "먹고싶은 음식과 먹고싶지 않은 음식");
		String food = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요.");
		System.out.println("당신이 먹고싶은 음식은 : " + food);
		String food2 = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요.");
		System.out.println("당신이 먹고싶지 않은 음식은 : " + food2);
		
	}
}
