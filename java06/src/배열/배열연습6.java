package 배열;

public class 배열연습6 {
	
	public static void main(String[] args) {
		
		double [] eyes = {0.3,0.5,1.0,1.5,2.0};
		char [] gender = {'남','여','남','여','남'};
		char [] SungJuk = {'A','B','C','D','F'};
		String [] name = {"홍길동", "설까치", "아이언맨","토르","스파이더맨"};
		int [] Jumsu = {100,80,70,60,50};
		
		System.out.print("친구 5명의 시력 : ");
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i]+", ");
		}
		System.out.println();
		System.out.print("친구 5명의 성별 : ");
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+", ");
		}
		System.out.println();
		System.out.print("친구 5명의 성적 : ");
		for (int i = 0; i < SungJuk.length; i++) {
			System.out.print(SungJuk[i]+", ");
		}
		System.out.println();
		System.out.print("친구 5명의 이름 : ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+", ");
		}
		System.out.println();
		System.out.print("친구 5명의 점수 : ");
		for (int i = 0; i < Jumsu.length; i++) {
			System.out.print(Jumsu[i]+", ");
		}
		
	}
}
