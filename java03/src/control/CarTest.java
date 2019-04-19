package control;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("자동차 성능 테스트");
		System.out.println("=============================");
		
		Scanner sc = new Scanner(System.in);
		
			while(true) {
				System.out.print("자동차 속도점수를 입력해주세요 : ");
				int speed = sc.nextInt();
				if(speed > 100) {
					System.out.println("만점100점을 초과하셨습니다. 다시 입력해주세요");
				}else {
						break;
					}
				while(true) {
				
				System.out.print("자동차 안정점수를 입력해주세요 : ");
				int safe = sc.nextInt();
				if(safe > 100) {
					System.out.println("만점100점을 초과하셨습니다. 다시 입력해주세요");
				}else {
					break;
				}
				while(true) {
				System.out.print("자동차 연비점수를 입력해주세요 : ");
				int price = sc.nextInt();
				if(safe > 100) {
					System.out.println("만점100점을 초과하셨습니다. 다시 입력해주세요");
				}else {
					break;
				}
		System.out.println("==================");	
				int SpeedResult = (int) ((int)speed*0.5);
				System.out.println("자동차 속도평점은 : " + SpeedResult);
				int SafeResult = (int)((int)safe*0.3);
				System.out.println("자동차 안정평점은 : " + SafeResult);
				int PriceResult = (int)((int)price*0.2);
				System.out.println("자동차 연비평점은 : " + PriceResult);
		
		System.out.println("=============================");	
			
			int total = SpeedResult+SafeResult+PriceResult;
			
			if(SpeedResult>=80 && SafeResult>=80 && PriceResult>=80) {
				System.out.println("결과 : 베스트");
			}
			if(total>=80) {
				System.out.println("결과 : 우수");
			}else if(total <80 && total >= 70) {
				System.out.println("결과 : 보통");
			}else {
				System.out.println("결과 : 불량");
					}
				}
			}
		}
	}
}
