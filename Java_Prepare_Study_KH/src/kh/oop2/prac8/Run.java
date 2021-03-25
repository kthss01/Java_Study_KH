package kh.oop2.prac8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("날짜를 입력하시오(ex: 2019-03-03): ");
		String str = sc.next(); // 띄어쓰기 없이 할 때는 next

		StringTokenizer st = new StringTokenizer(str, "-");

		int year = Integer.valueOf(st.nextToken()); // 년
		int month = Integer.valueOf(st.nextToken()); // 월
		int day = Integer.valueOf(st.nextToken()); // 일

		Calendar cl = new GregorianCalendar(year, month - 1, day); // 원하는 달보다 -1
		
		// 요일은 E
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.E");
		System.out.println(sdf.format(cl.getTime())); // format 안에 date형 자료형이 들어가야함
	}

}
