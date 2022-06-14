package org.java.oop;

public class Car1Main {
	
	public static void main(String[] args) {
	
	// aCar 다른말로 객체 참조변수(생성된 객체의 주소값)->객체라고 부른다
	//new 객체생성 연산자
	//클래스 -> 사용자 정의 타입
	Car1 aCar=new Car1();
	System.out.println(aCar.CITY);
	
	aCar.instanctMethod1();
	//객체의 기본값은 null
	aCar.carName="ACar";
	aCar.carCoin=10000;
	aCar.carYear=2020;
	aCar.carWidth=150;
	
	aCar.instanctMethod1();
	aCar.instanctMethod2();
	aCar.instanctMethod3();
	aCar.instanctMethod4();
	
	//private 맴버 setter
	aCar.setOption1("자동");
	aCar.setOption2("옵션2");
	
	//private 멤버 getter
	//매서드의 return값은 호출(call) 한곳에 return된다.
	System.out.println(aCar.getOption1());
	String option1=aCar.getOption1();
	System.out.println(option1);
	aCar.getOption2();
	
	Car1 bCar=new Car1();
	System.out.println(bCar.CITY);
	
	bCar.carName="BCar";
	bCar.carCoin=100000;
	bCar.carYear=2022;
	bCar.carWidth=180;
	
	bCar.instanctMethod1();
	bCar.instanctMethod2();
	bCar.instanctMethod3();
	bCar.instanctMethod4();
	
	Car1 cCar=new Car1();
	System.out.println(cCar.CITY);
	
	cCar.carName="CCar";
	cCar.carCoin=100000;
	cCar.carYear=2022;
	cCar.carWidth=180;
	
	cCar.instanctMethod1();
	cCar.instanctMethod2();
	cCar.instanctMethod3();
	cCar.instanctMethod4();
	
	Car1 dCar=new Car1();
	System.out.println(dCar.CITY);
	
	dCar.carName="DCar";
	dCar.carCoin=100000;
	dCar.carYear=2022;
	dCar.carWidth=180;
	
	dCar.instanctMethod1();
	dCar.instanctMethod2();
	dCar.instanctMethod3();
	dCar.instanctMethod4();
}
}