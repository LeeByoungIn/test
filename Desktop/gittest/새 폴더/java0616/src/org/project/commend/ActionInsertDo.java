package org.project.commend;

import org.project.dao.MemberDao;

public class ActionInsertDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원가입 실행");
		
		MemberDao dao = new MemberDao();
		int rs=dao.insertDo();
		System.out.println("반환값: "+rs);
		
		
	}
	
	

	
}
