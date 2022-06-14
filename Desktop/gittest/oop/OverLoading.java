package org.java.oop;

public class OverLoading {

	public void method() {
		
		System.out.println("매서드");
	}
	
	public void method (int num1, String name ) {
		System.out.println(name+num1);
	}
	public void method (int num1) {
		System.out.println(num1);
	}
	public void method (String name, int num1) {
		System.out.println(name + num1 );
	}
	// 반환 타입과 상이해도 오버로딩 성립하지 않는다
	// 매개 변수의 이름이 달라도 타입이 같으면 같은 매서드 취급
	
}
