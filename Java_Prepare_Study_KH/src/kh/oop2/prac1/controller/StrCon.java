package kh.oop2.prac1.controller;

public class StrCon {

	public void strMethod() {
		String str1 = "무궁화 꽃이 피었습니다."; // 리터럴1
		String str2 = new String("무궁화 꽃이 피었습니다."); // new 연산자 활용
		String str3 = new String("동해물과 백두산이"); // new 연산자 활용
		String str4 = "무궁화 꽃이 피었습니다."; // 리터럴2
		
		System.out.println("===== hashCode 비교 ====="); // 주소값이 아님 (String)
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		
		System.out.println("===== identityHashCode 비교 ====="); 
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));
	}

}
