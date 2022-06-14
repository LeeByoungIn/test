package org.java.oop;

//사용자 정의 타입
public class Classbasic {
	
	//필드(속성)
	public String userId; //인스턴스맴버
	public String userPw;//인스턴스맴버
	public int userAge;//인스턴스맴버
	//캡슐화
	private String projectName;
	//클래스 멤버 (static)
	public static int projectYear;
	
	public Classbasic() {
		//객체 생성시 필요한 특수한 매서드
		System.out.println("생성자(construct)");
	}
	
	//매서드
	//인스턴스매서드
	public void instanceMehto() {
		System.out.println("인스턴스매서드");
	}
	//클래스 매서드
	public static void classMathod() { // 객체를 생성안해도 접근가능 static
		System.out.println("클래스 매서드");
	}
	//getters, setters
	//private 멤버 (필드)를 초기화 set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private 멤버 (필드를) get
	public String getProjectName() {
		return this.projectName; //호출함 그 곳에 반환한다
	
	
	}

	
	}

