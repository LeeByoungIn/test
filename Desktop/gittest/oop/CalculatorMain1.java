package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// 두 숫자와 연산자(+-*/)입력받아서 각각의 매서드를 실행
		// 연산자 입력시 잘못입력 -"연산자 입력 오류"
		// while문을 이용해서 무한 반복 -> z입력하면 while문을 종료
		// 두 숫자 입력 setter
		// + sum(), -sub(),*multi(), /div() 호출 되도록 해보세요

		Scanner scn = new Scanner(System.in);
		Calculator1 c1 = new Calculator1();

		while (true) {
			System.out.println("첫번째 숫자 입력: ");
			int num1 = scn.nextInt();

			System.out.println("두번째 숫자 입력: ");
			int num2 = scn.nextInt();

			System.out.println("연산자 입력: ");
			String op = scn.next();

			if (op.equals("+")) {
				c1.sum();
			} else if (op.equals("-")) {
				System.out.println(c1.getNum1() + "-" + c1.getNum2() + "=" + c1.sub());
			} else if (op.equals("*")) {
				System.out.println(c1.getNum1() + "*" + c1.getNum2() + "=" + c1.multi());
			} else if (op.equals("/")) {
				System.out.println(c1.getNum1() + "/" + c1.getNum2() + "=" + c1.div());
			} else if (op.equals("z")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("연산자 입력 오류");
			}
		}
		scn.close();

	}

}
