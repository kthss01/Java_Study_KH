package example.variable;

import java.util.Scanner;

public class Variable {

	public void initVariable() {
		// 변수 선언과 동시에 초기화
		
		// 논리형 : 1 byte
		boolean isTrue = true;
		boolean isFalse = false;
		
		// 문자 : 2 byte
		char ch = 'a'; // '' 싱글 쿼테이션 사용
		// char ch2= 'bc'; // 하나의 문자만 대입 가능
		
		// 문자열 : 참조형 (주소값 저장)
		String str = "안녕하세요"; // "" 더블 쿼테이션 사용
		
		// 숫자형
		// 정수
		byte bnum = 1; // 1 byte
		short snum = 2; // 2 byte
		int inum = 4; // 4 byte
		long lnum = 8; // 8 byte
		
		// 실수
		float fnum = 4.0f; // 4 byte
		double dnum = 8.0; // 8 byte
		
		// 변수에 저장된 값 출력하기
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
	}
	
	public void changeValue() {
		// 변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;
		
		name = "김영희";
		gender = 'F';
		age = 20;
		height = 171.5;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		// 키보드로 값을 입력받아 변수에 저장된 값 변경
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("성별을 입력하세요 : ");
		gender = sc.next().charAt(0); // 문자를 읽어오는 메소든느 제공하지 않기 때문
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
	}
}
