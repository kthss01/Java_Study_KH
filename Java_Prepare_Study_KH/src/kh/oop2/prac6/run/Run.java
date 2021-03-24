package kh.oop2.prac6.run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ranNum = 0;
		int inputNum = 0;
		int count = 0;

		while (true) {
			ranNum = (int) (Math.random() * 10) + 1;
			System.out.println("1~10 사이의 랜덤 수 생성");
			count = 0;

			while (true) {
				System.out.print("정수를 하나 입력  (0) 종료");
				inputNum = sc.nextInt();
				if (inputNum == 0)
					break;
				count++;
				if (ranNum == inputNum) {
					System.out.println(count + "번만에 맞춤");
					break;
				} else {
					System.out.println(count + "번 실패");
				}
			}
		}
	}

}
