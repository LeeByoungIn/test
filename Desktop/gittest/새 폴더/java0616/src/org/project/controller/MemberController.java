package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDeleteDo;

import org.project.commend.ActionInsertDo;

import org.project.commend.ActionSeleteDo;

import org.project.commend.ActionUpdateDo;

import org.project.commend.ExcuteCommend;

public class MemberController {

	public static void main(String[] args) {

		ExcuteCommend commend = null;

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("콘솔출력");

			String query = scn.next();

			if (query.equals("insert")) {

				commend = new ActionInsertDo();

				commend.excuteQuery();

			} else if (query.equals("update")) {

				commend = new ActionUpdateDo();

				commend.excuteQuery();

			} else if (query.equals("delete")) {

				commend = new ActionDeleteDo();

				commend.excuteQuery();

			} else if (query.equals("select")) {

				commend = new ActionSeleteDo();

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
