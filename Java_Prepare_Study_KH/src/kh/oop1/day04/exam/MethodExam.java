package kh.oop1.day04.exam;

public class MethodExam {
	// 1. 매개변수가 없고, 리턴값도 없을 때
	/*
	 * [접근제한자] [예약어] void 메소드명 () {}
	 */
	public void method() {
		System.out.println("매개변수가 없고, 리턴값도 없을 때");
	}
	
	// 2. 매개변수가 있고, 리턴값이 없을 때
	/*
	 * [접근제한자] [예약어] void 메소드명(매개변수) {}
	 * 
	 * 매개변수의 값의 타입은 기본 자료형, 배열, 클래스, 가변인자
	 * 매개변수의 수는 여러개 일 수 있음. 구분은 ,(콤마)
	 */
	public void method2(int x) {
		System.out.println("매개변수는 " + x + " 리턴값은 없을 때");
	}
	
	public void method2(int x, String s) {
		System.out.println("매개변수가 한개 이상이고 리턴값은 없을 때");
	}
	
	public void method2(int[] x, String[] s) {
		System.out.println("매개변수가 배열 형태이고 리턴값은 없을 때");
	}
	
	// 3. 매개변수가 없고, 리턴값이 있을 때
	/*
	 * [접근제한자] [예약어] 반환형 메소드명() {}
	 */
	public int method3() {
		System.out.println("매개변수가 없고, 리턴값이 있을 때");
		return 10;
	}
	
	// 4. 매개변수가 있고, 리턴값이 있을 때
	/*
	 * [접근제한자] [예약어] 반환형 메소드명(매개변수) {}
	 */
	public String method4(int x) {
		return "매개변수가 있고, 리턴값이 있을 때";
	}
	
}
