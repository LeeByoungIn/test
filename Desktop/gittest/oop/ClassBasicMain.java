package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		//Ŭ���� �ɹ�, ��ü�� ���� ���� �ʾƵ� ���,����
		Classbasic.projectYear=2022;
		Classbasic.classMathod();
		
		//new -> ��ü���� ������
		//�ν��Ͻ�ȭ (��üȭ)
		Classbasic class1=new Classbasic();
		//�ν��Ͻ� ��� -> ��ü�� ������ �� ���� ����
		class1.userId="m111";
		class1.userPw="111";
		class1.userAge=10;
		class1.instanceMehto();
		
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		//private ��� �ʱ�ȭ setters
		class1.setProjectName("JAVAPROJECT2022");
		//private ��� getter
		String projectName=class1.getProjectName(); //�ż��带 ȣ���ϸ�
		System.out.println(projectName);
		
		//�ν��Ͻ�ȭ(��üȭ)
		Classbasic class2=new Classbasic();
		
		class2.userId="a1111";
		class2.userPw="2222";
		class2.userAge=20;
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);
		class2.instanceMehto();
	}
}
