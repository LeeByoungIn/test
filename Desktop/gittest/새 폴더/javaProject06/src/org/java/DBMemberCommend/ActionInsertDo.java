package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionInsertDo implements ActionCommend  {
	
	@Override
	public void excuteQuery() {
		System.out.println();
		
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.deleteDo();
		System.out.println("??ȯ??: "+result);
	}

}
