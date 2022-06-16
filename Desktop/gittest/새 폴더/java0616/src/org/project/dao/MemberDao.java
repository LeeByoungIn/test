package org.project.dao;

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao {
	//싱글톤 패턴 -> 객체를 한번만 생성
	//final 상수는 한번만 초기화 ->MemberDao 객체 한번만 생성
//	private static final MemberDao INSTANCE = new MemberDao();
//	private MemberDao() {}
//	
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}

	public MemberDao() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자");
	}
	//DB 접근해서 처리
	public int insertDo() {
		System.out.println("DB회원가입 실행");
		int rs=0;
		//처리문
		return rs;
	}
	public int updateDo() {
		System.out.println("DB회원수정 실행");
		int rs=0;
		//처리문
		return rs;
	}
	public int deleteDo() {
		System.out.println("DB회원삭제 실행");
		int rs=0;
		//처리문
		return rs;
	}
	
	public ArrayList<MemberDto> list(){
		System.out.println("DB회원조회 실행");
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		//처리문
		return lists;
	}
	
}
