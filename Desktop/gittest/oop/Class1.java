package org.java.oop;

public class Class1 {

	//�ν��Ͻ� ���
	public int num1;
	public int num2;
	private String key;
	//static Ŭ���� ���
	public final static String PROJECTNAME="JAVAPROJECT2022";
	//�ν��Ͻ� ���
	public void instansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼���");
	}
	//�ν��Ͻ� ���
	public int instansMethod2() {
		System.out.println("return���� int �ν��Ͻ� �޼���");
		return this.num1+this.num2;
	}
	//static Ŭ�������
	public static void classMethod() {
		System.out.println("Ŭ���� �޼���");
	}
	//setters ->private ��� �ʱ�ȭ
	public void setkey(String key) {
		this.key=key;
	}
	//getters ->private ��� get
	public String getkey() {
		return this.key;
	}
}
