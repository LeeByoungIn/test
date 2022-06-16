package org.java.abstractEx;

public class AbstractEx2SubSubMain {
	public static void main(String[] args) {
		AbstractEx2 a1= new AbstractEx2SubSub();
		a1.abstractMethod1();

		AbstractEx2Sub a2 = new AbstractEx2SubSub();
		a2.abstractMethod1();
		a2.abstractMethod2(100, 200);
		
		AbstractEx2SubSub a3 = new AbstractEx2SubSub();
		a3.abstractMehtod1();
		a3.abstractMethod2(100, 200);
		
		
	}
}
