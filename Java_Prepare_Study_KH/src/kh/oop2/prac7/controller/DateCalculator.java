package kh.oop2.prac7.controller;

import java.util.Calendar;

public class DateCalculator {
	int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public DateCalculator() {
	}

	// 1년 1월 1일부터 오늘까지의 총 날 수를 계산
	public long leapDate() {
//		int year = 2021;
//		int month = 3;
//		int day = 26;
//
//		long count = 0;
//
//		// 년도 계산
//		for (int i = 0; i < year; i++) {
//			count += 365;
//			if (isLeapYear(i))
//				count++;
//		}
//
//		// 월 수 계산
//		for (int i = 1; i < month; i++) {
//			count += months[i];
//			if (i == 2 && isLeapYear(year))
//				count++;
//		}
//		
//		// 일 수 계산
//		count += day; // -1 할 필요가 없음
//
//		return count;

		Calendar today = Calendar.getInstance();
		long sumDays = 0L;

		for (int i = 0; i <= today.get(Calendar.YEAR); i++) { // 해가 바뀜 (년도가 바뀌는)
			if (i == today.get(Calendar.YEAR)) { // 올해의 날짜만 계산
				for (int j = 1; j <= today.get(Calendar.MONTH) + 1; j++) {

					if (j == (today.get(Calendar.MONTH) + 1)) { // 달이 바뀜
						for (int n = 1; n <= today.get(Calendar.DATE); n++) {
							sumDays += 1;
						}
					} else if (j == 2) { // 올해 1월부터 저번 달까지 
						if (isLeapYear(i))
							sumDays += 29;
						else
							sumDays += 28;
					} else if (j == 4 || j == 6 || j == 9 || j == 11) {
						sumDays += 30;
					} else
						sumDays += 31;
				}
			} else { // 0년부터 작년까지
				if (isLeapYear(i))
					sumDays += 366;
				else
					sumDays += 365;
			}
		}
		
		return sumDays;
	}

	public boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
}
