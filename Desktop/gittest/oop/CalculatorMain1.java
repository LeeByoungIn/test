package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// �� ���ڿ� ������(+-*/)�Է¹޾Ƽ� ������ �ż��带 ����
		// ������ �Է½� �߸��Է� -"������ �Է� ����"
		// while���� �̿��ؼ� ���� �ݺ� -> z�Է��ϸ� while���� ����
		// �� ���� �Է� setter
		// + sum(), -sub(),*multi(), /div() ȣ�� �ǵ��� �غ�����

		Scanner scn = new Scanner(System.in);
		Calculator1 c1 = new Calculator1();

		while (true) {
			System.out.println("ù��° ���� �Է�: ");
			int num1 = scn.nextInt();

			System.out.println("�ι�° ���� �Է�: ");
			int num2 = scn.nextInt();

			System.out.println("������ �Է�: ");
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
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("������ �Է� ����");
			}
		}
		scn.close();

	}

}
