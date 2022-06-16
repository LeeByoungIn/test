package org.java.DBMemberDAO;

import java.util.ArrayList;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemberDAO {
//싱글톤 패턴 -> 객체를 한번만 생성
// private static final DBMemberDAo INSETAnce = new DBMemberDAO();
//public static DBMemberDAO getInstance(){
	//return INSTANCE;
//}
	public DBMemberDAO() {
		System.out.println("DAO생성자");
	}
	public int insertDo() {
		int result=0;
		return result;
	}
//	public ArrayList<DBMemberDTO> list (){
//		ArrayList<DBMemberDTO> lists=new ArrayList<DBMemberDTO>();
//		return lists;
//	}
	public ArrayList<DBMemberDTO> list (){
		ArrayList<DBMemberDTO> lists = new ArrayList<DBMemberDTO>();
		return lists;
	}
	public int updateDo() {
		int result=0;
		return result;
	}
	public int deleteDo() {
		int result=0;
		return result;
	}
	
}
