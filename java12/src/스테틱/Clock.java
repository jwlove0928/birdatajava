package ����ƽ;

public class Clock {

	int price;
	String name;
	int nowTime;
	String company;

	public Clock() {
		
	}
	public Clock(int price, String name, int nowTime, String company) {
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.company = company;
	}
	public Clock(int price, int nowTime, String company) {
		this.price = price;
		this.nowTime = nowTime;
		this.company = company;
	}
	public Clock(int price, String company) {
		super();
		this.price = price;
		this.company = company;
	}
	
	public String getcompany() {
		return company;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
}
