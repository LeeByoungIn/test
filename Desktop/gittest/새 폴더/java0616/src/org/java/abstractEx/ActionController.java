package org.java.abstractEx;

import java.util.Scanner;



public class ActionController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ActionCommend action=null;
		
		System.out.println("쿼리문을 입력하세요 (insert,update,select,delete");
		String input=scn.next();
		
		if(input.equals("insert")) {
			
			action = new ActionInsertDo();
			
			action.excuteQuery();
		
		}else if(input.equals("delete")) {
			
			action = new ActionDeleteDo();
			
			action.excuteQuery();
			
		} else if (input.equals("select")) {

			action = new ActionSelectDo();

			action.excuteQuery();

		} 

	}
}
