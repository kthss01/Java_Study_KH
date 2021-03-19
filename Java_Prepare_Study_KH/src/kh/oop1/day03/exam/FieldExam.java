package kh.oop1.day03.exam;

public class FieldExam {
	// [접근제한자] [예약어] 자료형 변수명 [=초기값];
	
	// 클래스 변수 
	// 모든 객체가 공통적으로 속성을 가질 때 사용을 하고 
	// 생성할 때 메모리 영역에 같이 생성되기 때문에
	// 꼭 필요한 공통적인 속성을 가진 변수에 사용을 해야함
	public static int var1;
	
	// 멤버변수 (인스턴스 변수)
	// 각각의 객체 (인스턴스)마다 개별적인 속성을 가질 때 사용을 함
	public int var2;
	private int var3; // 캡슐화 원칙으로 private 사용
	int var4; // 접근제한자 생략 시 default 접근제한자
	
	// 생성자
	public FieldExam() {
		String var5 = "생성자 지역변수"; // 지역 변수
		System.out.println(var5);
	}
	
	// 초기화 블럭
	{
		String var6 = "초기화 블럭 지역 변수"; // 지역 변수
		System.out.println(var6);
	}
	
	// 메소드
	public String method() {
		String var7 = "메소드 안의 지역변수"; // 지역 변수
		return var7;
	}
	
	public static String method1() {
		String var8 = "static 안의 지역변수"; // 지역 변수
		return var8;
	}
}
