package kh.oop2.prac3.run;

import kh.oop2.prac3.controller.TestWork;

public class Run {

	public static void main(String[] args) {
		String str = "J a v a P r o g r a m";
		TestWork tw = new TestWork();
		System.out.println("------ 토큰 처리하기 ------");
		tw.afterToeken(str);
		
		System.out.println("------ 문자 갯수 찾기 ------");
		tw.findChar();
	}

}
