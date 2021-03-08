package practice.variable;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		// 문제 1 초기화 및 값 변경
		int inum = 100;
		double dnum = 234.567;
//		float dnum = 234.567f;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;

		System.out.println("초기화 후 : " + inum + ", " + dnum + ", " + 
				ch + ", " + str + ", " + bool);
		
		inum = 10000;
		dnum = 567.12356789;
//		dnum = 567.12356789f;
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;
		
		System.out.println("값 변경 후 : " + inum + ", " + dnum + ", " + 
				ch + ", " + str + ", " + bool);
	}
	
	public void method2() {
		// 문제 2 원의 둘레와 면적 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름 입력 : ");
		int rad = sc.nextInt();
		double pi = 3.14;
		
//		System.out.println("반지름이 " + rad + "인 원의 둘레 : " + 2 * pi * rad);
//		System.out.println("반지름이 " + rad + "인 원의 넓이 : " + pi * rad * rad);
		
		// 소수점 아래 한자리까지
		System.out.printf("반지름이 %d인 원의 둘레 : %.1f\n", rad, 2 * pi * rad);
		System.out.printf("반지름이 %d인 원의 넓이 : %.1f\n", rad, pi * rad * rad);
	}
}
