package 스테틱;

public class 창업 {

	public static void main(String[] args) {
		
		Member work1 = new Member("이소윤","여",40);
		Member work2 = new Member("장채연","여",50);
		Member work3 = new Member("권재우","남",29);
		
		System.out.println("전체 직원수? : " + Member.count);
		System.out.println("직원들의 평균 나이? : " + Member.sumage/Member.count);
		System.out.println("첫번째 직원의 이름은 ? " + work1.name);
	}
}
