package org.project.commend;

import org.project.dao.MemberDao;

public class ActionInsertDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
		
		MemberDao dao = new MemberDao();
		int rs=dao.insertDo();
		System.out.println("��ȯ��: "+rs);
		
		
	}
	
	

	
}
