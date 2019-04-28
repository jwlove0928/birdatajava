package 배열연습;

import java.util.Scanner;

public class 배열연습2 {

	public static void main(String[] args) {
		
		String[] names = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		int[] Hak = {1,2,3,1,1,};
		char[] HakJum = {'A','B','C','A','B'};;
		
		System.out.println("동아리 명단의 이번학기 성적입니다.");
		System.out.println();
		System.out.println("이름\t" + "학년\t" + "학점\t");
		System.out.println("-------------------");
				
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"\t"+Hak[i]+"\t"+HakJum[i]);
		}
		
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			count++;
		}
		System.out.println("1. 전체 인원은? " + count);
		
		System.out.println("2. 전체 명단 프린트는? " + names[0]+", " + 
		names[1] + "," + names[2] + "," + names[3] + "," + names[4]);
		
		int count2 = 0; //학년별 인원수 카운트변수
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < Hak.length; i++) {
			if(Hak[i] == 1) {
				count2++;
			}else if(Hak[i] == 2) {
				count3++;
			}else if(Hak[i] == 3) {
				count4++;
			}
		}
		int count5 = 0; //학점 별 인원수 카운트변수
		int count6 = 0;
		int count7 = 0;
		
		for (int i = 0; i < HakJum.length; i++) {
			if(HakJum[i] == 'A') {
				count5++;
			}else if(HakJum[i] == 'B') {
				count6++;
			}else if(HakJum[i] == 'C') {
				count7++;
			}
		}
		System.out.println("3. 학년별 인원수 : " + "1학년 = " + count2
				+ ", 2학년= " + count3 + ", 3학년= " + count4
		+ "\n      학점 별 인원수 : " + "A학점 = " + count5 + ", B학점 = " + count6 + ", C학점 = " + count7);
		
		int max = count2;
		int imsi = 0;
		for (int i = 0; i < HakJum.length; i++) {
			
			if(max < count3) {
				imsi = max;
				max = count3;
				count3 = imsi;
				max = Hak[i];
			}else if(max < count4){
				imsi = max;
				max = count4;
				count4 = imsi;
				max = Hak[i];
			}else {
				max = count2;
				max = Hak[i];
			}
		}
		System.out.println("4. 이 동아리에 가장 많은 학년은? " + max + "학년");
		
		int max1 = count5;
		int imsi2 = 0;
		for (int i = 0; i < HakJum.length; i++) {
			
			if(max1 < count6) {
				imsi2 = max1;
				max1 = count6;
				count6 = imsi2;
				max1 = HakJum[i];
			}else if(max1 < count7){
				imsi2 = max1;
				max1 = count7;
				count7 = imsi2;
				max1 = HakJum[i];
			}else {
				max1 = count5;
				max1 = HakJum[i];
			}
		}
		System.out.println("5. 이 동아리 학생들의 가장 많은 학점은? " + max1 + "학점");
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("6. 이름을 입력받아 몇번째 인덱스에 있는지 찾아보세요.");
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.next();
		
		for (int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				System.out.println(names[i] + "의 주소값은 : " + i);
			}
		}
		System.out.println("7. 이름을 입력받아 학년과 학점을 출력해보세요.");
		System.out.print("이름을 입력하세요 : ");
		
		String name2 = sc.next();
		
		for (int j = 0; j < names.length; j++) {
			if(name2.equals(names[j])) {
					System.out.println(Hak[j] + "학년, " + HakJum[j] + "학점");
				}
			}
		}
}
