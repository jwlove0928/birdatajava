package control;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int com = random.nextInt(3);
		
		System.out.println("가위바위보 게임입니다. 선택해주세요");
		System.out.println("========================");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0.가위 1.바위 2.보");
		System.out.println("========================");
		System.out.println("컴퓨터가 낸 숫자 : " + com);
		int me = sc.nextInt();
		System.out.println("내가 낸 숫자 : " + me);
		
		if(me>com) {
			if(me == 0 && com == 2) {
			System.out.println("이겼습니다.");
			}else if(me == 2 && com == 0) {
			System.out.println("졌습니다.");
		    }
		}else if(com>me) {
			if(me == 2 && com == 0) {
			System.out.println("졌습니다.");
			}else if(me == 0 && com == 2) {
			System.out.println("졌습니다.");
		    }
		} else if(com == me) {
			System.out.println("비겼습니다.");
			}
		}
	}
