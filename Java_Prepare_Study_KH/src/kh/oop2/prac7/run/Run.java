package kh.oop2.prac7.run;

import java.util.Calendar;

import kh.oop2.prac7.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		DateCalculator dc = new DateCalculator();
//		System.out.println(dc.isLeapYear(2021) ? "올해는 윤년입니다." : "올해는 평년입니다.");
		
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR)); // 2021 년 이렇게 잘 나옴 -1 이런거 필요 x
		if(dc.isLeapYear(cal.get(Calendar.YEAR)))
			System.out.println("올해는 윤년");
		else
			System.out.println("올해는 평년");
		
		System.out.println("총 날짜 수 : " + dc.leapDate());
	}

}
