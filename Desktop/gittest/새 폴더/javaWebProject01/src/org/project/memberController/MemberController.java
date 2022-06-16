package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommend.ActionDeleteDo;
import org.project.memberCommend.ActionInsertDo;
import org.project.memberCommend.ActionSelectDo;
import org.project.memberCommend.ExcuteCommend;

public class MemberController {
	
	public static void main(String[] args) {
		
		ExcuteCommend commend = null;
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("콘솔출력");
			
			String query = scn.next();
			
			if(query.equals("insert")) {
				
				commend = new ActionInsertDo();
				
				commend.excuteQuery();
			
			}else if(query.equals("delete")) {
				
				commend = new ActionDeleteDo();
				
				commend.excuteQuery();
				
			} else if (query.equals("select")) {

				commend = new ActionSelectDo();

				commend.excuteQuery();

			} else if (query.equals("z")) {

				System.out.println("종료합니다");

				break;

			} else {

				System.out.println("다시입력");

			}

		}
	}
}
