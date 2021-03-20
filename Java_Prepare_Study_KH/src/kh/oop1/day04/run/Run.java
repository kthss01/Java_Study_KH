package kh.oop1.day04.run;

import kh.oop1.day04.exam.Student;

public class Run {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentNo(1);
		st.setStudentName("홍길동");
		
		System.out.println(st.getStudentNo());
		System.out.println(st.getStudentName());
	}

}
