package org.java.Interface;

public interface InterfaceEx_1 {
	//�������̽� ���
	// int num1;
	public static final int MAXIMUM=100; //�ѹ��� �ʱ�ȭ, final �ʵ常 ���
	
	public abstract void abstract1(); // �߻�޼��� �ַ� ���
	
	default void defaultMethod() {
		System.out.println("default �޼���");
	}
	public static void staticMethod() {
		System.out.println("static �޼���");
	}
	//public void basicMethod(){}//�Ϲݸ޼���X
}
