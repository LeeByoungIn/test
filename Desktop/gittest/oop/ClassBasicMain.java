package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		//클래스 맴버, 객체를 생성 하지 않아도 사용,공용
		Classbasic.projectYear=2022;
		Classbasic.classMathod();
		
		//new -> 객체생성 연산자
		//인스턴스화 (객체화)
		Classbasic class1=new Classbasic();
		//인스턴스 멤버 -> 객체를 생성한 후 접근 가능
		class1.userId="m111";
		class1.userPw="111";
		class1.userAge=10;
		class1.instanceMehto();
		
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		//private 멤버 초기화 setters
		class1.setProjectName("JAVAPROJECT2022");
		//private 멤버 getter
		String projectName=class1.getProjectName(); //매서드를 호출하면
		System.out.println(projectName);
		
		//인스턴스화(객체화)
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
