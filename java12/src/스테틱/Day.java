package ����ƽ;

public class Day {

	String doing;
	int time;
	String location;
	static int count;
	static int stime; //�ѽð�
	static double avr;
	
	public Day() {
	}

	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		stime = stime + time;
		avr = stime/count;
	}
	
	public static int getTotal() {
		return stime; 
		//return time(x); <= static �޼ҵ峻�� ���Ǵ� ��������� �ݵ��  static������
		//��ü������ ������� Ŭ�����̸����� ���ٰ����� ����
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
