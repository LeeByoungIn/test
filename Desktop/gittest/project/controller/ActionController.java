package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

import Inheritance.DeleteCommend;
import Inheritance.InsertCommend;
import Inheritance.SelectCommend;
import Inheritance.UpdateCommend;

public class ActionController {

	public static void main(String[] args) {
		
		 Scanner scn= new Scanner(System.in);
		 
		 while(true){
				System.out.println("쿼리문을 입력하세요(insert,select,update,delete)");
				String query = scn.next();
				
			if (query.equals("insert")) {
				ActionInsert insert = new ActionInsert();
				insert.excuteQuery();
			} else if (query.equals("select")) {
				ActionSelect select = new ActionSelect();
				select.excuteQuery();
			} else if (query.equals("update")) {
				ActionUpdate update = new ActionUpdate();
				update.excuteQuery();
			} else if (query.equals("delete")) {
				ActionDelete delete = new ActionDelete();
				delete.excuteQuery();
			} else if (query.contentEquals("exit")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다른 쿼리문 입력하면 다시 입력 하세요 ");
			}
		}
		scn.close();
	}
}
