package org.java.oop;

//����� ���� Ÿ��
public class Classbasic {
	
	//�ʵ�(�Ӽ�)
	public String userId; //�ν��Ͻ��ɹ�
	public String userPw;//�ν��Ͻ��ɹ�
	public int userAge;//�ν��Ͻ��ɹ�
	//ĸ��ȭ
	private String projectName;
	//Ŭ���� ��� (static)
	public static int projectYear;
	
	public Classbasic() {
		//��ü ������ �ʿ��� Ư���� �ż���
		System.out.println("������(construct)");
	}
	
	//�ż���
	//�ν��Ͻ��ż���
	public void instanceMehto() {
		System.out.println("�ν��Ͻ��ż���");
	}
	//Ŭ���� �ż���
	public static void classMathod() { // ��ü�� �������ص� ���ٰ��� static
		System.out.println("Ŭ���� �ż���");
	}
	//getters, setters
	//private ��� (�ʵ�)�� �ʱ�ȭ set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private ��� (�ʵ带) get
	public String getProjectName() {
		return this.projectName; //ȣ���� �� ���� ��ȯ�Ѵ�
	
	
	}

	
	}

