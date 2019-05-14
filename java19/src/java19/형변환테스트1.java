package java19;

public class 형변환테스트1 {

	public static void main(String[] args) {
		//형벼환(type change : 타입변환, casting, 캐스팅)
		//기초형 형변환
		//자동형변환
		byte a  = 127;
		int b = a;
		
		//큰 -> 작 : 강제형변환
		int c = 127;
		byte d = (byte)c;
		
		//참조형 형변환(클래스의 형변환)
		//상속관계에 있는 클래스들만 형변환 가능
		//자식(작)->부모(큰) : 자동형변환(**up캐스팅)
		
		
		//부모(큰)->자식(작) : 강제형변환(**down캐스팅)
		
	}
}
