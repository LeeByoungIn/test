package org.java.oop;

public class Calculator {

	public void add(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		//return void 리턴값 생략
	}
	public void sub(int num1, int num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}
	public void div(int num1, int num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
	}
	public void multi(int num1, int num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	}
	public static void staticMethod() {
		System.out.println("static");
	}
}