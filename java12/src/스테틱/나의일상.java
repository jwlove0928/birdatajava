package 스테틱;

public class 나의일상 {

	public static void main(String[] args) {
		
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		
		System.out.println("전체 하는 일의 시간은 : " + Day.stime);
		System.out.println("평균 하는 일의 시간은 : " + Day.avr);
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트 : \n" + day1 + "\n" + day2 + "\n" + day3);
		System.out.println("며칠 간 했는지? : " + Day.count + "일");
	}
}
