package control;

public class IfTest1 {
	
	public static void main(String[] args) {
		//if뒤에는 반드시 조건을 쓴다!
		//조건의 결과는 boolean(논리형, true/false)
		
		System.out.println("저기요!!!");
		System.out.println("-----------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-----------------");
		System.out.println("1)짜장면, 2");
		
		
		int food = 2;
		if(food == 1) { //콘솔에서 입력
			System.out.println("짜장면을 선택!!");
		}else if(food == 2){
			System.out.println("짬뽕을 선택!!");
		}else if(food == 3){
			System.out.println("우동을 선택!!");
		}else {
			System.out.println("다시 선택해주세요. 없는 메뉴입니다.");
		}
	} // main end. -- 표식
} //class end. --표식 (작업시 코딩이 길어졌을때 오류방지위함)
