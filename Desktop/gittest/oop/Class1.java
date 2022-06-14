package org.java.oop;

public class Class1 {

	//인스턴스 멤버
	public int num1;
	public int num2;
	private String key;
	//static 클래스 멤버
	public final static String PROJECTNAME="JAVAPROJECT2022";
	//인스턴스 멤버
	public void instansMethod() {
		System.out.println("return이 없는 인스턴스 메서드");
	}
	//인스턴스 멤버
	public int instansMethod2() {
		System.out.println("return값이 int 인스턴스 메서드");
		return this.num1+this.num2;
	}
	//static 클래스멤버
	public static void classMethod() {
		System.out.println("클래스 메서드");
	}
	//setters ->private 멤버 초기화
	public void setkey(String key) {
		this.key=key;
	}
	//getters ->private 멤버 get
	public String getkey() {
		return this.key;
	}
}
