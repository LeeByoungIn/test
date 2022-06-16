package org.java.Interface;

public interface InterfaceEx_1 {
	//인터페이스 멤버
	// int num1;
	public static final int MAXIMUM=100; //한번만 초기화, final 필드만 사용
	
	public abstract void abstract1(); // 추상메서드 주로 사용
	
	default void defaultMethod() {
		System.out.println("default 메서드");
	}
	public static void staticMethod() {
		System.out.println("static 메서드");
	}
	//public void basicMethod(){}//일반메서드X
}
