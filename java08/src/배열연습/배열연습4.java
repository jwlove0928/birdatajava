package 배열연습;

import java.util.Scanner;

public class 배열연습4 {

	public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
         
         System.out.println("파티에 참석한 사람의 명단(이름 + 나이)을 입력");
         
         String[] names = new String[5];
         int[] age = new int[5];
         
         
         int count = 0; //인원수 카운트 담는 변수
         for (int i = 0; i < names.length; i++) {
            count++;
         }
         
         System.out.println("전체 인원수 출력 : " + count + "명");
         
         System.out.println("====================");
         
         
         for (int i = 0; i < names.length; i++) {
            System.out.print("이름을 입력하시오 : ");
            names[i] = sc.next();         
            System.out.print("나이를 입력하시오 : ");
            age[i] = sc.nextInt();
         }
         for (int i = 0; i < names.length; i++) {         
            System.out.println("이름은 :" + names[i] + ", " + "나이는:" + age[i]);
         }
         System.out.println("참석자 나이의 평균을 구하시오");
         System.out.println();
         double avr = 0; //나이의 평균 넣는 변수
         int sum = 0; //나이의 합 넣는 변수
         for (int i = 0; i < age.length; i++) {
         sum = sum + age[i];
      }
         avr = sum/count;
         System.out.println("파티 참석자 나이의 평균은 " + avr + "세입니다.");
   }
}
