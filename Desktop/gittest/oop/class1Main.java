package org.java.oop;

public class class1Main {
	public static void main(String[] args) {
		
		//�ν��Ͻ�ȭ(��üȭ)
		// new =��ü ���� ������
		// c1 ��ü�� �ּ�
		// ��ü. ->��ü ���� ������
		Class1 c1=new Class1();
		
		c1.num1=100;
		c1.num2=200;
		c1.setkey("key2"); // private setters
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getkey());//private getters
		
		Class1 c2=new Class1();
		
		c2.num1=200;
		c2.num2=1000;
		c2.setkey("key2");
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getkey());//private getters
		
		System.out.println(Class1.PROJECTNAME);
		Class1.classMethod();
}
}