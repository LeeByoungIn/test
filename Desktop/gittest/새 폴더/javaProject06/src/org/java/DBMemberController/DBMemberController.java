package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommend.ActionCommend;
import org.java.DBMemberCommend.ActionDeteleDo;
import org.java.DBMemberCommend.ActionInsertDo;
import org.java.DBMemberCommend.ActionSelectDo;




public class DBMemberController {
	public static void main(String[] args) {
		ActionCommend commend = null;

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("콘솔출력");

			String query = scn.next();

			if (query.equals("insert")) {

				commend = new ActionInsertDo();

				commend.excuteQuery();

			} else if (query.equals("delete")) {

				commend = new ActionDeteleDo();

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
