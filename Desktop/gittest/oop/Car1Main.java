package org.java.oop;

public class Car1Main {
	
	public static void main(String[] args) {
	
	// aCar �ٸ����� ��ü ��������(������ ��ü�� �ּҰ�)->��ü��� �θ���
	//new ��ü���� ������
	//Ŭ���� -> ����� ���� Ÿ��
	Car1 aCar=new Car1();
	System.out.println(aCar.CITY);
	
	aCar.instanctMethod1();
	//��ü�� �⺻���� null
	aCar.carName="ACar";
	aCar.carCoin=10000;
	aCar.carYear=2020;
	aCar.carWidth=150;
	
	aCar.instanctMethod1();
	aCar.instanctMethod2();
	aCar.instanctMethod3();
	aCar.instanctMethod4();
	
	//private �ɹ� setter
	aCar.setOption1("�ڵ�");
	aCar.setOption2("�ɼ�2");
	
	//private ��� getter
	//�ż����� return���� ȣ��(call) �Ѱ��� return�ȴ�.
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