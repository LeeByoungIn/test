package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdateDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원수정 실행");
							//싱글톤 객체생성 (한번만 생성)
		
		MemberDao dao = new MemberDao();
		
		int rs=dao.updateDo();
		System.out.println("반환값: "+rs);
	}
}