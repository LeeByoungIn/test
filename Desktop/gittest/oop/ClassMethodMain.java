package org.java.oop;

public class ClassMethodMain {

	
	
	public static void main(String[] args) {
		
		ClassMethod c1=new ClassMethod();
		c1.method1();//call
		c1.method2(100, 200);//call
		
		int sum=c1.method3();//call
		System.out.println(c1.method3());
		System.out.println(sum);
		
		int sum2=c1.method4(200, 3000);
		System.out.println(c1.method4(300,500));
		System.out.println(sum2);
		
		//클래스 매서도 호출
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(100, 200);
		
		
		
	}
}
