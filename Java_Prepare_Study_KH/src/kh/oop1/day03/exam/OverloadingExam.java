package kh.oop1.day03.exam;

public class OverloadingExam {
	// 오버로딩의 조건
	// 1. 메소드의 이름은 동일해야함
	int intI;
	String strS;
	
	public void method() {
		
	}
	
	// 2. 매개변수의 타입이 달라야 함
	public void method(int intI) {
		
	}
	
//	public void method(int intII) {
//		
//	}
	
	public void method(String strS) {
		
	}

	// 3. 매개변수의 갯수가 달라야 한다.
	public void method(int intI, String strS) {
		
	}
	
	// 4. [주의] 매개변수의 위치가 달라도 다른 메소드로 인식
	public void method(String strS, int intI) {
		
	}
}
