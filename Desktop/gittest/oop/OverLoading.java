package org.java.oop;

public class OverLoading {

	public void method() {
		
		System.out.println("�ż���");
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
	// ��ȯ Ÿ�԰� �����ص� �����ε� �������� �ʴ´�
	// �Ű� ������ �̸��� �޶� Ÿ���� ������ ���� �ż��� ���
	
}
