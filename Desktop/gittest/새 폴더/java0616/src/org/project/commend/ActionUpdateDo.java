package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdateDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
							//�̱��� ��ü���� (�ѹ��� ����)
		
		MemberDao dao = new MemberDao();
		
		int rs=dao.updateDo();
		System.out.println("��ȯ��: "+rs);
	}
}