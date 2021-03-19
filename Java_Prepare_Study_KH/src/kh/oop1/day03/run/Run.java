package kh.oop1.day03.run;

import kh.oop1.day03.exam.ThisConstructor;

public class Run {

	public static void main(String[] args) {
		// 클래스 변수는 사용
		// 클래스명을 써주고 .을 입력 후 클래스 변수 / 메소드 사용
//		System.out.println(FieldExam.var1);
//		System.out.println(FieldExam.method1());
		
		// 멤버 변수
		// 객체를 생성해 메모리 heap 영역에 생성 한 후에 접근이 가능
		// 객체 생성 후 변수 / 메소드 접근 
//		FieldExam fe = new FieldExam();
//		System.out.println(fe.var2);
//		System.out.println(fe.method());
		
//		BlockExam be = new BlockExam();
//		System.out.println(be.name);
		
		// JVM 기본값 확인
//		System.out.println("Bool: " + InitVariable.bool);
//		System.out.println("Byte: " + InitVariable.by);
//		System.out.println("Char: " + InitVariable.ch);
//		System.out.println("Double: " + InitVariable.d);
//		System.out.println("Float: " + InitVariable.f);
//		System.out.println("Integer: " + InitVariable.i);
//		System.out.println("Long: " + InitVariable.l);
//		System.out.println("Short: " + InitVariable.sh);
//		System.out.println("String: " + InitVariable.str);
		
		ThisConstructor ts = new ThisConstructor("객체", 1000, 1);
		System.out.println("책 이름 : " + ts.getBookName() + "\n"  
				+ "책 가격 : " + ts.getBookPrice() + "\n"
				+ "출판사 : " + ts.getBookPublisher() + "\n"
				+ "책 아이디  " + ts.getBookId());
	}

}
