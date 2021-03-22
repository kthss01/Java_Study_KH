package kh.oop2.inherit.child.model.vo;

import kh.oop2.inherit.parent.model.vo.Person;

public class Student extends Person {
	private int grade; // 학년
	private String major; // 전공
	
	private Computer com; // 컴퓨터 (포함 관계)

	public Student() {
//		super(); // 안써져도 컴파일러에서 처리해줌
	}

	public Student(int grade, String major) {
		super();
		this.grade = grade;
		this.major = major;
	}

	public Student(String name, int age, char gender, String addr, int grade, String major) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
	}

	public Student(String name, int age, char gender, String addr, int grade, String major, Computer com) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
		this.com = com;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

//	public String information() {
//		return "학년 : " + grade + ", 전공 : " + major;
//	}
	
	public String information() {
//		return "이름 : " + name + ", 나이 : " + 
//				age + ", 성별 : " + gender + ", 주소 : " + addr + 
//				", 학년 : " + grade + ", 전공 : " + major;
		return super.information() + ", 학년 : " + grade + ", 전공 : " + major + ", " + com.information();
	}
}
