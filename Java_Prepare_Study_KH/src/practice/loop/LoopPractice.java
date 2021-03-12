package practice.loop;

import java.util.Scanner;

public class LoopPractice {
	public void method1() {
		// 피라미드 모양 별 찍기

		// 외부 for문 줄 조건
		for (int i = 0; i < 4; i++) {
			// 내부 for문 칸 조건
			// 공백 출력 (3,2,1,0)
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력 (1,3,5,7)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method2() {
		// 마름모 모양 별 찍기
		System.out.println("홀수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// num = 7이라면
		// 상단부(피라미드) 0~2행
		for (int i = 0; i < num / 2; i++) {
			// 공백 출력 (3,2,1)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력 (1,3,5)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}

		// 하단부(피라미드) 3~6행
		for (int i = num / 2; i >= 0; i--) {
			// 공백 출력 (0,1,2,3)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력 (7,5,3,1)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}
	}
}
