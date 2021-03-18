package kh.oop1.day02.run;

import kh.oop1.day02.exam.Coffee;
import kh.oop1.day02.exam.ImportExam;

public class Run {
	public static void main(String[] args) {
		Coffee c = new Coffee();
		
//		CoffeeMachine cm = new CoffeeMachine(); // default는 같은 패키지 내에서만 접근 가능
		
		ImportExam ie = new ImportExam();
		System.out.println(ie.piExam());
		
		System.out.println(ie.randomExam(10)); // 0부터 9까지의 값 출력
		System.out.println(ie.sortExam());
	}
}
