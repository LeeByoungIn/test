package org.java.oop;

public class Car1 {
	
	//인스턴스 멤버 (필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	//fianl 상수는 생성과 동식에 초기화 해야된다-변경불가
	//public static final String CITY="서울";
	public static String CITY;
	
	//private setter,getter 매서드 생성
	private String option1;
	private String option2;
	
	//setters ->private 멤버 초기화
	public void setOption1(String option1) {
		this.option1=option1;
	}
	//getters ->private 멤버 get
	public String getOption1() {
		return this.option1;
	}
	public void setOption2(String option2) {
		this.option2=option2;
	}
	public String getOption2() {
		return this.option2;
	}
	//인스턴스 멤버(매서드)
	public void instanctMethod1() {
		System.out.println("자동차 이름 : " +this.carName);
	}
	//인스턴스 멤버(매서드)
	public void instanctMethod2() {
		System.out.println("자동차 가격 : " +this.carCoin);
	}
	//인스턴스 멤버(매서드)
	public void instanctMethod3() {
		System.out.println("자동차 연식 : " +this.carYear);
	}
	//인스턴스 멤버(매서드)
	public void instanctMethod4() {
		System.out.println("자동차 너비 : " +this.carWidth);
	}
	}
	


