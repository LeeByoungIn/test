package org.java.oop;

public class Car1 {
	
	//�ν��Ͻ� ��� (�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	//fianl ����� ������ ���Ŀ� �ʱ�ȭ �ؾߵȴ�-����Ұ�
	//public static final String CITY="����";
	public static String CITY;
	
	//private setter,getter �ż��� ����
	private String option1;
	private String option2;
	
	//setters ->private ��� �ʱ�ȭ
	public void setOption1(String option1) {
		this.option1=option1;
	}
	//getters ->private ��� get
	public String getOption1() {
		return this.option1;
	}
	public void setOption2(String option2) {
		this.option2=option2;
	}
	public String getOption2() {
		return this.option2;
	}
	//�ν��Ͻ� ���(�ż���)
	public void instanctMethod1() {
		System.out.println("�ڵ��� �̸� : " +this.carName);
	}
	//�ν��Ͻ� ���(�ż���)
	public void instanctMethod2() {
		System.out.println("�ڵ��� ���� : " +this.carCoin);
	}
	//�ν��Ͻ� ���(�ż���)
	public void instanctMethod3() {
		System.out.println("�ڵ��� ���� : " +this.carYear);
	}
	//�ν��Ͻ� ���(�ż���)
	public void instanctMethod4() {
		System.out.println("�ڵ��� �ʺ� : " +this.carWidth);
	}
	}
	


